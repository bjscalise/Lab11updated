
public class Car {
	
	private String make; //All of the static variables are declared here.
	private String model;
	private int year;
	private double price;

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-10s %-15s", make, model, year, "$" + price); //This creates the format for the list.
	}

	public String getMake() { //Getters
		return make;
	}

	public void setMake(String make) { //Setters
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car() { //This is a non-argument
		
	}
	
	public Car(String make, String model, int year, double price) {
		super();
	this.make = make; 
	this.model = model;
	this.year = year;
	this.price = price;
	}
	
}
