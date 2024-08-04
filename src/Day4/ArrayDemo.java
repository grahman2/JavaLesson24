package Day4;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		
		int myArray[] = new int[5];
		
		myArray[0] =10;
		myArray[1] =20;
		myArray[2] =30;
		myArray[3] =40;
		myArray[4] =50;
		
		System.out.println(myArray[4]);
		int length = myArray.length;
		System.out.println("The Length is:" + length);
		
		System.out.println(myArray.length);
		
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(a.length);
		System.out.println(a[4]);
		
		System.out.println(Arrays.toString(myArray));
		
		for(int i=0; i<5; i++) {
			
			System.out.println(myArray[i]);
			
		}
		System.out.println("using enhanced for a loop");
		//use enhanced for loop to print all the values of an array
		for(int mA :myArray) {
			System.out.println(mA);
			
		System.out.println("Printing in Reverse");	
		for(int i = myArray.length -1; i>=0; i--)	{
			System.out.println(myArray[i]);
		}
		}
		
	}

}
