package Day19Assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static boolean isValidPassword(String password) {

		String regex = "^(?=\\S+$).{8,}$";
		Pattern p = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}

	public static void main(String args[]) {
		String str1 = "Arun@gmail34";
		System.out.println(isValidPassword(str1));

		String str2 = "Sachin";
		System.out.println(isValidPassword(str2));

		String str3 = "Rudharash@ munmbai12";
		System.out.println(isValidPassword(str3));

		String str4 = "9879";
		System.out.println(isValidPassword(str4));

		String str5 = "Deepak@23";
		System.out.println(isValidPassword(str5));

		String str6 = "Pooja@123";
		System.out.println(isValidPassword(str6));
	}
}
