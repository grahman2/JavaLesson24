package Day5;

public class PrintDayNumber {
	public static void main (String[] args) {
		
		String DayName = "Monday".toLowerCase();
		
		switch(dayName) {
		case "monday" : {
			System.out.println("Day One:");
			break;
		}
		case "tuesday" : {
			System.out.println("Day Two:");
			break;
		}
		case "wednsday" : {
			System.out.println("Day Three:");
			break;
		}
		case "thurday" : {
			System.out.println("Day Four:");
			break;
		}
		case "friday" : {
			System.out.println("Day Five:");
			break;
		}
		case "satday" : {
			System.out.println("Day Six:");
			break;
		}
		case "sunday" : {
			System.out.println("Day Seven:");
			break;
		
		default System.out.println("Invalid Day Name");
		}
		
				
	}

}
