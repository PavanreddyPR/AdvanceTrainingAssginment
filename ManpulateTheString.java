package Pack5;

import java.util.regex.Pattern;

public class ManpulateTheString 
{
	
	static String reverseWords(String str)
	{
        Pattern pattern = Pattern.compile("\\s");
  
        String[] temp = pattern.split(str);
        String result = "";
  
         for (int i = 0; i < temp.length; i++)
         {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
	
    }

	 public static void main(String args[])
	 { 
		    
	        String S1 = new String("JAVA is Simple");
	        
	       
	        //Convert to LowerCase
	        System.out.println(S1.toLowerCase());
	        // Convert to UpperCase
	        System.out.println(S1.toUpperCase());
	        // getting Specified characters 
	        System.out.println(S1.charAt(0) +" "+ S1.charAt(5) +" "+ S1.charAt(6));
	        // Reverse the words 	        
	        System.out.println(reverseWords(S1));
	        
	       // Reverse the Characters in each words in a string
	        char[] try1 = S1.toCharArray();
	        
	        for (int i = try1.length - 1; i >= 0; i--) 
	        {
	            System.out.print(try1[i]);
	        }
	 
	       
	    }
	                
}
	 



