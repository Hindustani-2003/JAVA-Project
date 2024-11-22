package com.gsv.basics;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.time.LocalTime;
	import java.util.ArrayList;
	import java.util.Random;
	import java.sql.*;

	public class Frame2 extends JFrame implements ActionListener, KeyListener {
	    String passage = "";
	    String typedPass = "";
	    String message = "";
	    String userName = ""; // To store the user's name

	    int typed = 0;
	    int count = 0;
	    int WPM;

	    double start;
	    double end;
	    double elapsed;
	    double seconds;

	    boolean running;
	    boolean ended;

	    final int SCREEN_WIDTH;
	    final int SCREEN_HEIGHT;
	    final int DELAY = 100;

	    JButton button;
	    Timer timer;
	    JLabel label;
	    DataBaseManager db =new DataBaseManager();
	    ResultSet resultset;

	    Connection connection; // For SQL connection

	    public Frame2() {
	    	String Driver="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/typingtest";
			String username="root";
			String password="root";
//			Connection con=null;
//			Statement  stmt=null;
//			ResultSet rs=null;
	        this.setLayout(new BorderLayout());
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        SCREEN_WIDTH = 720;
	        SCREEN_HEIGHT = 400;
	        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
	        this.setVisible(true);
	        this.setLocationRelativeTo(null);

	        button = new JButton("Start");
	        button.setFont(new Font("Candara", Font.BOLD, 30));
	        button.setForeground(Color.BLUE);
	        button.setVisible(true);
	        button.addActionListener(this);
	        button.setFocusable(false);

	        label = new JLabel();
	        label.setText("Click the Start Button");
	        label.setFont(new Font("Candara", Font.BOLD, 30));
	        label.setVisible(true);
	        label.setOpaque(true);
	        label.setHorizontalAlignment(JLabel.CENTER);
	        label.setBackground(Color.lightGray);

	        this.add(button, BorderLayout.SOUTH);
	        this.add(label, BorderLayout.NORTH);
	        this.getContentPane().setBackground(Color.WHITE);
	        this.addKeyListener(this);
	        this.setFocusable(true);
	        this.setResizable(false);
	        this.setTitle("Typing Test");
	        this.revalidate();

	        // Initialize the database connection
	        try {
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TypingTest", "root", "password");
	        } catch (SQLException e) {
	            JOptionPane.showMessageDialog(this, "Database connection failed: " + e.getMessage());
	        }
	    }

	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        draw(g);
	    }

	    public void draw(Graphics g) {
	        g.setFont(new Font("Candara", Font.BOLD, 25));

	        if (running) {
	            if (passage.length() > 1) {
	                g.drawString(passage.substring(0, 50), g.getFont().getSize(), g.getFont().getSize() * 5);
	                g.drawString(passage.substring(50, 100), g.getFont().getSize(), g.getFont().getSize() * 7);
	                g.drawString(passage.substring(100, 150), g.getFont().getSize(), g.getFont().getSize() * 9);
	                g.drawString(passage.substring(150, 200), g.getFont().getSize(), g.getFont().getSize() * 11);
	            }

	            g.setColor(Color.GREEN);
	            if (typedPass.length() > 0) {
	                if (typed < 50)
	                    g.drawString(typedPass.substring(0, typed), g.getFont().getSize(), g.getFont().getSize() * 5);
	                else
	                    g.drawString(typedPass.substring(0, 50), g.getFont().getSize(), g.getFont().getSize() * 5);
	            }
	            if (typedPass.length() > 50) {
	                if (typed < 100)
	                    g.drawString(typedPass.substring(50, typed), g.getFont().getSize(), g.getFont().getSize() * 7);
	                else
	                    g.drawString(typedPass.substring(50, 100), g.getFont().getSize(), g.getFont().getSize() * 7);
	            }
	            if (typedPass.length() > 100) {
	                if (typed < 150)
	                    g.drawString(typedPass.substring(100, typed), g.getFont().getSize(), g.getFont().getSize() * 9);
	                else
	                    g.drawString(typedPass.substring(100, 150), g.getFont().getSize(), g.getFont().getSize() * 9);
	            }
	            if (typedPass.length() > 150)
	                g.drawString(typedPass.substring(150, typed), g.getFont().getSize(), g.getFont().getSize() * 11);
	            running = false;
	        }
	        if (ended) {
	            if (WPM <= 40)
	                message = "You are an Average Typist";
	            else if (WPM > 40 && WPM <= 60)
	                message = "You are a Good Typist";
	            else if (WPM > 60 && WPM <= 100)
	                message = "You are an Excellent Typist";
	            else
	                message = "You are an Elite Typist";

	            FontMetrics metrics = getFontMetrics(g.getFont());
	            g.setColor(Color.BLUE);
	            g.drawString("Typing Test Completed!", (SCREEN_WIDTH - metrics.stringWidth("Typing Test Completed!")) / 2, g.getFont().getSize() * 6);

	            g.setColor(Color.BLACK);
	            g.drawString("Typing Speed: " + WPM + " Words Per Minute", (SCREEN_WIDTH - metrics.stringWidth("Typing Speed: " + WPM + " Words Per Minute")) / 2, g.getFont().getSize() * 9);
	            g.drawString(message, (SCREEN_WIDTH - metrics.stringWidth(message)) / 2, g.getFont().getSize() * 11);

	            // Save results to database
	            try {
	                String sql = "INSERT INTO results (name, wpm) VALUES (?, ?)";
	                PreparedStatement statement = connection.prepareStatement(sql);
	                statement.setString(1, userName);
	                statement.setInt(2, WPM);
	                statement.executeUpdate();
	            } catch (SQLException e) {
	                JOptionPane.showMessageDialog(this, "Failed to save results: " + e.getMessage());
	            }

	            timer.stop();
	            ended = false;

	            // Display all results from the database
	            try {
	                String sql = "SELECT * FROM results";
	                Statement statement = connection.createStatement();
	                ResultSet resultSet = statement.executeQuery(sql);
	                int y = g.getFont().getSize() * 13;
	                g.drawString("Previous Results:", (SCREEN_WIDTH - metrics.stringWidth("Previous Results:")) / 2, y);
	                while (resultSet.next()) {
	                    y += g.getFont().getSize() * 2;
	                    String record = resultSet.getString("name") + ": " + resultSet.getInt("wpm") + " WPM";
	                    g.drawString(record, (SCREEN_WIDTH - metrics.stringWidth(record)) / 2, y);
	                }
	            } catch (SQLException e) {
	                JOptionPane.showMessageDialog(this, "Failed to retrieve results: " + e.getMessage());
	            }
	        }
	    }

	    @Override
	    public void keyTyped(KeyEvent e) {
	        if (passage.length() > 1) {
	            if (count == 0)
	                start = LocalTime.now().toNanoOfDay();
	            else if (count == 200) {
	                end = LocalTime.now().toNanoOfDay();
	                elapsed = end - start;
	                seconds = elapsed / 1000000000.0;
	                WPM = (int) (((200.0 / 5) / seconds) * 60);
	                ended = true;
	                running = false;
	                count++;
	            }
	            char[] pass = passage.toCharArray();
	            if (typed < 200) {
	                running = true;
	                if (e.getKeyChar() == pass[typed]) {
	                    typedPass = typedPass + pass[typed];
	                    typed++;
	                    count++;
	                }
	            }
	        }
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {}

	    @Override
	    public void keyReleased(KeyEvent e) {}

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == button) {
	            userName = JOptionPane.showInputDialog(this, "Enter your name:");
	            if (userName == null || userName.trim().isEmpty()) {
	                JOptionPane.showMessageDialog(this, "Name cannot be empty!");
	                return;
	            }

	            passage = getPassage();
	            timer = new Timer(DELAY, this);
	            timer.start();
	            running = true;
	            ended = false;

	            typedPass = "";
	            message = "";

	            repaint();
	        }
	    }

	    public String getPassage() {
	        ArrayList<String> passages = new ArrayList<>();
	        passages.add("This is a test passage for the typing test application. Try to type as accurately and as quickly as you can.");
	        passages.add("Another example passage for users to practice their typing speed. The goal is to type quickly and correctly.");
	        // Add more passages as needed...

	        Random random = new Random();
	        return passages.get(random.nextInt(passages.size())).strip();
	    }

	    public static void main(String[] args) {
	        new Frame2();
	    }
	}

