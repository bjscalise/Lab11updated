import java.util.ArrayList;
import java.util.Scanner;

public class CarDealershipApp {

	/*
	 * Prompt the user for # of cars to enter. Prompt the user for details about the
	 * cars. Create a class named Cars to store the data about the cars 1) String
	 * for make 2) String for model 3) an int for year 4) A double for price. A
	 * no-argument constructor that sets data members to default values (blanks or
	 * your choice) A constructor with 4 arguments mathcing the above Getters and
	 * Setters for all data members A .toString() method returning a formatted
	 * String with the car details. Create multiple instances of a Car object within
	 * this class. Print out a table of all of the cars entered.
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int listSize = Validator.getInt(scan, "How many cars to add?"); // The user enters the # of cars that they would
																		// like to add.

		ArrayList<Car> carList = new ArrayList<>(); // Created the array list.

		for (int i = 0; i < listSize; i++) { // This for loop will iterate the amount of times the user has selected. It
												// will prompt for car data and send to the validator.
			String make = Validator.getString(scan, "Make: ");
			String model = Validator.getString(scan, "Model: ");
			int year = Validator.getYear(scan, "Year: ", 1950, 2019);
			double price = Validator.getDouble(scan, "Price: ");

			carList.add(new Car(make, model, year, price)); // This adds each car to the arrayList
		}

		System.out.println("Car List");
		System.out.printf("%-15s %-15s %-10s %-15s \n", "Make", "Model", "Year", "Price");
		System.out.println("=======================================================");

		for (Car car : carList) {
			System.out.println(car.toString()); // This prints out the list of cars entered.
		}

	}

}
