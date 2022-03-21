package pack18;

import java.util.*;

public class RepeatingDecimal 
  {

//Java program to calculate fraction of two numbers
  public static String calculateFraction(int num, int den)
	{
		if (num == 0)
			return "0"; // if numerator is zero
		if (den == 0)
			return ""; // if denominator is zero

		// result StringBuilder

		StringBuilder result = new StringBuilder();
		if ((num < 0) ^ (den < 0))
			result.append("-"); // check -ve sign

		// absolute values of num and den

		num = Math.abs(num);
		den = Math.abs(den);

		long quo = num / den; // Quotient
		long rem = num % den * 10; // calculating remainder

		result.append(
			String.valueOf(quo)); // appending quotient
		if (rem == 0)
			return result
				.toString(); // return if remainder is 0

		// if remainder is not zero, continue

		result.append(".");
		Map<Long, Integer> m
			= new HashMap<>(); // map for storing remainder
							// and the indexes of the
							// appropriate decimal in
							// stringbuilder

		while (rem != 0) {

			if (m.containsKey(rem)) {

				// if the rem is already present, find the
				// index and append ( )

				int index = m.get(rem);
				String part1 = result.substring(0, index);
				String part2 = "("
							+ result.substring(
								index, result.length())
							+ ")";
				return part1 + part2;
			}

			// continue updating the map and appending quo
			// which was generated by dividing rem with den

			m.put(rem, result.length());
			quo = rem / den;
			result.append(String.valueOf(quo));

			// update rem
			rem = (rem % den) * 10;
		}
		return result.toString();
	}

	
	public static void main(String[] args)
	{
		int num = 1;
		int den = 3;

		String resString1 = calculateFraction(num, den);

		num = 1;
		den = 4;

		String resString2 = calculateFraction(num, den);
		
		 num=1;
		 den=6; 
		 
		 String resString3 = calculateFraction(num, den);
			
          num=1; 
          den=7; 
          
          String resString4 = calculateFraction(num, den);
  		
		System.out.println(resString1);
		System.out.println(resString2);
		System.out.println(resString3);
		System.out.println(resString4);
		
		
	}
}

