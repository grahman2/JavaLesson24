package Day5;

public class StringManipulation {
	public static void main(String[] args) {
	
		        // Example 1: Replacing spaces with underscores
		        String s = "welcome to java selenium automation";
		        System.out.println(s.replace(" ", "_"));

		        // Example 2: Extracting only 'abc' from the following string
		        s = "abc,123@m.com";
		        String[] c = s.split(",");
		        System.out.println(c[0]); // Output: abc

		        // Example 3: Using trim() method
		        s = "   welcome to java   ";
		        System.out.println(s.length()); // Output: 20
		        System.out.println(s.trim().length()); // Output: 15

		        // Example 4: Using charAt() method
		        s = "Java Selenium";
		        System.out.println(s.charAt(5)); // Output: S
		        System.out.println(s.charAt(7)); // Output: l

		        // Example 5: Using contains() method
		        System.out.println(s.contains("Jav")); // Output: true
		        System.out.println(s.contains("Sel")); // Output: true
		        System.out.println(s.contains("ium")); // Output: true
		        System.out.println(s.contains("Sli")); // Output: false
		        System.out.println(s.contains("a S")); // Output: true

		        // Example 6: Using equals() and equalsIgnoreCase() methods
		        String s1 = "Welcome";
		        String s2 = "welcome";
		        System.out.println(s1.equals("welcome")); // Output: false
		        System.out.println(s1.equalsIgnoreCase(s2)); // Output: true

		        // Example 7: Using length() method
		        String s3 = "Welcome 123";
		        String s4 = new String("Welcome");
		        int length = s4.length();
		        System.out.println("The length is: " + length); // Output: 7
		        System.out.println(s3.length()); // Output: 11

		        // Example 8: Using concat() method
		        String s5 = "Welcome";
		        String s6 = " to java";
		        String s7 = " programming.";
		        System.out.println(s5 + s6); // Output: Welcome to java
		        System.out.println(s5.concat(s6).concat(s7)); // Output: Welcome to java programming.
		    }
		}

		
		
		
	


