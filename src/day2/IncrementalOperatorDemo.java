package day2;

public class IncrementalOperatorDemo {

	public static void main(String[] args)  {
		
		//increment operators  ++
		
		int a = 10;
	//	a = a+1;  ++ is basicalcally increasing increment by one
		a++;
		System.out.println(a); //11
		
		//post increment
		int x = 10;
		int result = x++;
		System.out.println(result);//10
		System.out.println(x);//11
		
		//preincrement
		int b = 20;
		int res = ++b;
		System.out.println(res);//21
	
	}
}
