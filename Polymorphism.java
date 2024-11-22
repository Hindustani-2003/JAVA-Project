package com.gsv.basics;

class X
{
	static final float PI=3.14f;
	final void show()
	 {
		 System.out.println("X show");
	 }
	 
}
class Y extends X
{
	/*  Final method cannot override
	 void show()
	 {
		 System.out.println("Y show");
	 }
	 */
}
class Z extends Y
{
	/*  Final method cannot override
	 void show()
	 {
		 System.out.println("Z show");
	 }
	 */
}

public class Polymorphism {

	  public static void main(String[] args) 
	  {
		    //B.show();
		  X all[]  =new X[3];
		  all[0] = new X();
		  all[1] = new Y();
		  all[2] = new Z();
		  for(int i=0;i<all.length;i++)
		  {
			  all[i].show();
		  }
		  
	  }
	}
