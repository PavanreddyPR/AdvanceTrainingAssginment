package SecondPack;

public class Array {
 
    public static void main(String[] args)
    {
 
    	 int[] array = { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };
    	
    	 System.out.println("Max is : "+ max(array));
    	 System.out.println("Min is : "+ min(array));
    	 System.out.println("sum is : "+ sum(array));
    	 System.out.println("avg is : "+ average(array));
    	  	 
    }
    
   // sum 
    
    public static int sum(int[] x)
    {
    	int sum=0; 
    	
    	for(int i=0; i < x.length; i++)
    	{
    		sum += x[i]; 
    	}
    	return sum; 
    	
    }
    //average
    public static int average(int[] x)
    {
    	int sum=0; 
    	
    	for(int i=0; i < x.length; i++)
    	{
    		sum += x[i]; 
    	}
    	return sum / x.length; 
    	
    } 
 // min 
    public static int min(int[] x)
    {
    	int temp = x[0]; 
    	
    	for(int i=0; i < x.length; i++)
    	{
    		if(temp > x[i])
    			temp=x[i]; 
    	}
    	return temp; 
    }
    
    // max 
    public static int max(int[] x)
    {
    	int temp = x[0]; 
    	
    	for(int i=0; i < x.length; i++)
    	{
    		if(temp < x[i])
    			temp=x[i]; 
    	}
    	return temp; 
    	
    }
    
}  