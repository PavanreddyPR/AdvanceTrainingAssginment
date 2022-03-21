package FirstPack;

import java.util.*;

public class TestRectangle {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length Value : ");
	        double l = sc.nextDouble(); 
	        
	        System.out.print("Enter Width value : ");
	        double w = sc.nextDouble();
		
		
		 // Create a Rectangle object with default values
	      Rectangle1 r1 = new Rectangle1();

	      System.out.println("Area of Rectangle is "    + r1.getArea());
	      
	      System.out.println("Perimeter of Rectangle is " + r1.getPerimeter());

	      // Create a Rectangle object with given set of values
	      
	      Rectangle1 r2 = new Rectangle1(l,w);

	      System.out.println("Area of Rectangle is " + r2.getArea()); 
	      
	      System.out.println("Perimeter of Rectangle " + r2.getPerimeter());
			
	}

}
