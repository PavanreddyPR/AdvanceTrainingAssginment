package SecondPack;

public class FibonacciSeries 
    {

	  public static void main(String[] args) {

	    //int n = Integer.parseInt(args[0]); we can use this line command n=13
	    		
	    int firstTerm = Integer.parseInt(args[0]);
	    int secondTerm = Integer.parseInt(args[1]);
	    
	    
	    System.out.println("Fibonacci Series till " + 13 + " terms:");

	    for (int i = 1; i <= 13; ++i)
	    {
	      System.out.print(firstTerm + ", ");

	       int nextTerm = firstTerm + secondTerm;// addition
	      firstTerm = secondTerm; //swapping
	      secondTerm = nextTerm; // swapping
	    }
	  }
    }

/* To run this code in command line arguments Eclipse 
 * Follow the below steps: 
 * 1) Right click on file 
 * 2) Run as>>>Run Configuration>>>select x Argument>>>>give the values
 */
