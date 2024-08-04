package Day5;

public class SmallestOfThreeNumbers {
	
	public static void main(String[] args) {
		
		int a = 89, b = 67, c = 37, smallest;
		
		int temp = (a < b) ?  a : b;
		smallest = (c < temp) ? c : temp;
		System.out.println("The smallest number is " + smallest);
		
		int Smallest = c < (a < b ? a :b) ? c: (a < b ? a : b);
		System.out.println("Smallest is: " + Smallest);
	}

}
