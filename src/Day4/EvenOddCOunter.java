package Day4;

public class EvenOddCOunter {
	


	    public static void main(String[] args) {
	        // Declaration and initialization of the array
	        int[] numbers = {10, 25, 33, 47, 52, 66, 71, 82, 95, 100};

	        // Variables to count even and odd numbers
	        int evenCount = 0;
	        int oddCount = 0;

	        // Enhanced for loop to iterate over the array
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                evenCount++; // Increment evenCount if the number is even
	            } else {
	                oddCount++; // Increment oddCount if the number is odd
	            }
	        }

	        // Output the counts of even and odd numbers
	        System.out.println("Even numbers count: " + evenCount);
	        System.out.println("Odd numbers count: " + oddCount);
	    }
	}



