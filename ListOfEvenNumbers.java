package FirstPack;

	import java.util.*;
	
	public class ListOfEvenNumbers {
	   public static void main(String []args)

	   {
	       int n=0,i=0;
	       
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.print("Enter value n : ");
	       n = sc.nextInt();
	       
	       for(i=1; i<n; i++)

	       {
	           if(i%2==0)

	               System.out.print(i+" ");

	       }    

	       System.out.println();    

	   }

	}





