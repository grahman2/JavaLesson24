package Day5;

public class ReversingArray {

	    public static void main(String[] args) {
	        // Initialize the array
	        int[] a = {10, 45, 23, 76, 35, 90, 35};

	        // Get the size of the array
	        int size = a.length;

	        // Loop to reverse the array
	        for (int i = 0; i < size / 2; i++) {
	            // Swap elements
	            int temp = a[i];
	            a[i] = a[size - i - 1];
	            a[size - i - 1] = temp;
	        }

	        // Print the reversed array
	        System.out.println("Reversed array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
	}



