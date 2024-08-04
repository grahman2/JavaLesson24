package Day6;
import java.util.Arrays;
public class LargestAndLowest {
    public static void main(String[] args) {
    	//using iteration "greedy approach"
    	int arr[] = {3, 8, 8, 9, 2, 67, 34, 67};
    	int mini = arr[0];
    	int max = arr[0];
    	
    	for (int i = 0; i < arr.length; i++) {
    		if(arr[i] < mini)  {
    			mini = arr[i];
    		}else if (arr[i] > max)  {
    			max = arr[i];
    			
    		}
    	}
    	System.out.println("The minimum value is: " + mini);
    	System.out.println("The maximim value is: " + max);
	//using predefined functions/library
    	
    	int minimum = Arrays.stream(arr).min().getAsInt();
    	int maximum = Arrays.stream(arr).max().getAsInt();
    	
    	System.out.println("The Minimum value is: " + minimum);
    	System.out.println("The Maximim value is: " + maximum);
    	
}
}
