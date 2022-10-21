package Day19Assignment;

import java.util.regex.Pattern;

public class AllSampleEmail {

	public static boolean isValidEmail(String email) {

		String eMailRegex = ("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		boolean isMatched = Pattern.compile(eMailRegex).matcher(email).matches();
		if (isMatched)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {

		String str1 = "abc@yahoo.com";
		System.out.println(isValidEmail(str1));

		String str2 = "abc-100@yahoo.com";
		System.out.println(isValidEmail(str2));

		String str3 = "abc.100@yahoo.com";
		System.out.println(isValidEmail(str3));

		String str4 = "abc111@abc.com";
		System.out.println(isValidEmail(str4));

		String str5 = "abc-100@abc.net";
		System.out.println(isValidEmail(str5));

		String str6 = "abc.100@abc.com.au";
		System.out.println(isValidEmail(str6));

		String str7 = "abc@1.com";
		System.out.println(isValidEmail(str7));

		String str8 = "abc@gmail.com.com";
		System.out.println(isValidEmail(str8));

		String str9 = "abc+100@gmail.com";
		System.out.println(isValidEmail(str9));

		String str10 = "agfv@hhhj@hjjh.lkj";
		System.out.println(isValidEmail(str10));
	}
}