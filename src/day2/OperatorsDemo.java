package day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic operators + - * / %
		int a = 20 , b = 10;
		
		
		System.out.println("Sum of a and b is: " + (a+b));//30
		System.out.println("Diff of a and b is: " + (a-b));//10
		System.out.println("Mul of a and b is: " + (a*b));//200
		System.out.println("Div of a and b is: " + (a/b));//2'
		System.out.println("Modulus of a and b is: " + (a%b));//0
		//Modulus is aka the remainder operator
		
	/*	Relational/comparison operators > < >= <+ |= ==
		Returns boolean value - true or false
		*/
		System.out.println("------ Relational Operators -------".repeat(3));
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		//Logical Operators &&|| !
		System.out.println("------- Logical Operators --------".repeat(3));
		//returns a boolean values
		// works between two boolean values
		
		boolean x = true, y = false;
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
	}	
		
		
		
	
	
}
