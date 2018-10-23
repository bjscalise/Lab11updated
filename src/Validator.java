import java.util.Scanner;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); //This reads the user entry and ensures a String.
		return s;
	}

	public static int getInt(Scanner scan, String prompt) {
		int n = 0; // Creates double d. This will be hold the same value as the input entered into
					// the scanner.
		boolean isValid = false;
		while (isValid == false) { // This while loop will execute until a valid input is entered.
			System.out.print(prompt);
			if (scan.hasNextInt()) {
				n = scan.nextInt();
				if (n > 0) {
					isValid = true; // This loop will finish executing after isValid becomes true.
				} else {
					System.out.println("Please enter positive integer.");
				}
			} else {
				System.out.println("Please enter a positive value.");
			}
			scan.nextLine();
		}
		return n; // This method will return d to main.
	}

	public static int getYear(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < 1950)
				System.out.println("Please enter a year after " + min);
			else if (i > 2019)
				System.out.println("Please enter a year before" + max);
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}

		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}
}




