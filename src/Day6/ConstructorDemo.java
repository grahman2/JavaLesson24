package Day6;

public class ConstructorDemo {
	String name;
	String streetname;
	int houseNumber;
	String zipcode;
	public ConstructorDemo(String name, String streetname, int houseNumber, String zipcode) {
		this.name = name;
		this.streetname = streetname;
		this.houseNumber = houseNumber;
		this.zipcode = zipcode;
		
	
		
	}
	
	public String declareAddress() {
		return (name + "\n" + houseNumber + ", " + streetname + "\n" + zipcode);
	}

}
