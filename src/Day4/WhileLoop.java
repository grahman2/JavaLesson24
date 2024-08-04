package Day4;

public class WhileLoop {

	public static void main(String[] args) {
		
		//initialization; condition/logic; increment/decrement
		System.out.println("***** Useing for Loop *****".repeat(2));

		
		for(int num = 1; num <= 5; num++) {
			System.out.println(num);
		}
		System.out.println("***** Useing while Loop *****".repeat(2));
		//print 1 to 5 using while loop 
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num ++;
		}
		System.out.println("***** Useing do Loop *****".repeat(2));
		//PRINT 1 TO 5 USING DO WHILE LOOP
		
		int number = 1 ;
		do {
			System.out.println("**John**");
			number++;
		}while(number<=5);
		
		
	}
	
}
