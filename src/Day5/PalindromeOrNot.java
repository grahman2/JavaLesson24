package Day5;

public class PalindromeOrNot {
	public static void main(String[] args) {
	
		        // Declare and initialize the original number and reverse
		        int originalNumber = 353, reverse = 0;

		        // Print the original number
		        System.out.println("The original number is: " + originalNumber);

		        // Copy the original number to another variable
		        int number = originalNumber;

		        // Loop to reverse the number
		        while (number != 0) {
		            // Get the last digit
		            int remainder = number % 10;
		            // Update the reverse number
		            reverse = reverse * 10 + remainder;
		            // Remove the last digit from the original number
		            number = number / 10;
		        }

		        // Print the reversed number
		        System.out.println("The reverse number is: " + reverse);

		        // Check if the original number and the reversed number are the same
		        if (originalNumber == reverse) {
		            System.out.println("It is palindrome");
		        } else {
		            System.out.println("Not a palindrome!!");
		        }
		    }
		}

