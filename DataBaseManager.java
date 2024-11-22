import java.sql.*;

public class DataBaseManager {
    private Connection connection;

    // Constructor to establish a database connection
    public DataBaseManager() {
        try {
            // Update the URL, username, and password based on your MySQL setup
            String url = "jdbc:mysql://localhost:3306/TypingTest";
            String username = "root";
            String password = "password";

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully.");
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
    }

    // Method to insert results into the database
    public void insertResult(String name, int wpm) {
        String query = "INSERT INTO results (name, wpm) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setInt(2, wpm);
            statement.executeUpdate();
            System.out.println("Result inserted successfully.");
        } catch (SQLException e) {
            System.err.println("Failed to insert result: " + e.getMessage());
        }
    }

    // Method to retrieve all results from the database
    public ResultSet getResults() {
        String query = "SELECT * FROM results";
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("Failed to retrieve results: " + e.getMessage());
            return null;
        }
    }

    // Close the connection when no longer needed
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Failed to close the connection: " + e.getMessage());
        }
    }
}