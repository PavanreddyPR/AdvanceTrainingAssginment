package pack9;

public class FrequencyOfElements
{

	// Function to print the frequency  of each element of the sorted array
	
	static void printFreq(int arr[], int N)
	{

		// Stores the frequency of an element
		int freq = 1;

		// Traverse the array array
		
		for (int i = 1; i < N; i++) 
		{
			// If the current element is equal
			// to the previous element
			if (arr[i] == arr[i - 1])
			{
				// Increment the freq by 1
				freq++;
			}

			
			else 
			{
				System.out.println( arr[i - 1]+ " Occurs " + freq +" times");
				// Update freq
				freq = 1;
			}
		}

		// Print the frequency of the last element
		System.out.println( arr[N - 1]+ " Occurs " + freq + " times");
	}

	
	public static void main(String args[])
	{
		// Given Input
		int arr[]	= { 2,2,2,4,4,4,5,5,6,8,8,9 };
		int N = arr.length;

		// Function Call
		printFreq(arr, N);
	}
}
