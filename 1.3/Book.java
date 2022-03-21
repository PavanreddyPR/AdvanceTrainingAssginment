package FirstPack;

public class Book
{
  
	String name; 
	Double price; 
	 
	

	public void book(String name,Double price)
	{
		this.name=name; 
		this.price=price; 
		System.out.println("Name of the Book "+ name); 
		System.out.println("Price of the Book "+ price); 	
	}
	
	public void display()
	{
		System.out.println("Name of the Book "+ name); 
		System.out.println("Price of the Book "+ price); 	
	}
	
	public void print()
	{
		System.out.println("Name of the Book "+ name); 
		System.out.println("Price of the Book "+ price); 	
	}
	
}
