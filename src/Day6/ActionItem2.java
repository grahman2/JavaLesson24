package Day6;

public class ActionItem2 {
	public static void main(String[] args) {
		System.out.println( "Printing all the odd numbers: ");
		int[] arr = {2, 7, 3, 78, 23, 44, 66, 35};
		for(int i=0; i<arr.length; i++)  {
			if(arr[i] % 2 !=0) {
				System.out.print(arr[i] +  "  ");
			}
		}
		
		System.out.println();
		System.out.println( "Printing all the even numbers: ");
		for(int i=0; i<arr.length; i++)  {
			if(arr[i] % 2 ==0) {
				System.out.print(arr[i] + "  ");
			}
		}
	}

}
