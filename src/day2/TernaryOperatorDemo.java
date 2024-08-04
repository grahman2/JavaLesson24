package day2;

public class TernaryOperatorDemo {
	
	public static void main(String[] args) {
		
		//Conditional or ternary operator ? :
		
		int age = 25;
	String result	= (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";
	System.out.println(result);
	
	int a = 25, b = 10;
	//System.out.printf("initial value of a %d and b %d",  a, b);
	System.out.println("initial value of a is: " + a + " and b is: "+ b);
	a=b;
	b=b/2*5;
	System.out.println(a);
	System.out.println(b);
	//System.out.printf("initial value of a %d and b %d",  a, b);
	System.out.println("initial final of a is: " + a + " and b is: "+ b);
	}

}
