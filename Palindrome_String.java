package SecondPack;

public class Palindrome_String 
{
	public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }
 
        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
 
        return true;
    }
 
    public static void main (String[] args)
    {
        //String str = "bob";
    	
    	System.out.println("Your argument is: "+args[0]);
		
        System.out.println(args[0].toUpperCase());
		
		System.out.println("string length is: "+args[0].length());

        if (isPalindrome(args[0]))
        {
            System.out.println("It is a Palindrome");
        }
        else 
        {
            System.out.println("It is Not Palindrome");
        }
    }
}
	
	
			
			

