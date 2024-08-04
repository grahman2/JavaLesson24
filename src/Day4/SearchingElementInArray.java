package Day4;

import java.util.Scanner;

public class SearchingElementInArray {
	
	
	public static void main(String[] args) {
		
		int a[] = {10, 40, 20, 30, 60, 50, 90, 80};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Type a Number to Search for.");
		
		boolean status = false;  //create a status state
		//declare a number to search for
		int search_num = sc.nextInt();
		for (int i=0; i <a.length; i++) {
			if(search_num == a[i]) {
				System.out.println("Element found!!");
				status = true;
				break;
			}
		}
 		if(status == false) {
 			System.out.println("Element not found!!");
 		}
		
		
		
	}
	
	

}
