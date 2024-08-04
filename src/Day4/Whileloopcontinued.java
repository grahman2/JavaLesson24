package Day4;

public class Whileloopcontinued {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			if(i==5) {
				break;//Jumping statement
			}
		}
		System.out.println("Situation2");
		for(int i=1; i<=10; i++ ) {
		if(i==5) {
			continue;//skip the current sequence
		}
		System.out.println(i);
		}
	}
	
}
