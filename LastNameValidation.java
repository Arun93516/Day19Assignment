package Day19Assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LastNameValidation {

	private static boolean validate(String lastNameRegex, String lastname) {
		return Pattern.compile(lastNameRegex).matcher(lastname).matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String lastNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}";

		System.out.println("Enter your Last Name :  ");
		String lastname = scanner.next();

		boolean last = validate(lastNameRegex, lastname);
		if (last == true)
			System.out.println("Valid Last Name");
		else
			System.out.println("In-valid Last Name");

	}
}
