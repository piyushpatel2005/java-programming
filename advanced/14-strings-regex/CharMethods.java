import java.util.Scanner;

public class CharMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a character and press Enter");
		String input = scanner.next();
		char c = input.charAt(0);

		System.out.printf("isDefined: %b%n", Character.isDefined(c));
		System.out.printf("isDigit: %b%n", Character.isDigit(c));
		System.out.printf("isJavaIdentifierStart(c): %b%n", Character.isJavaIdentifierStart(c));	
		// Java identifier means those characters that can be used in variable or method name.

		System.out.printf("isJavaIdentifierPart(c): %b%n", Character.isJavaIdentifierPart(c));

		System.out.printf("isLetter(c): %b%n", Character.isLetter(c));

		System.out.printf("isLetterOrDigit(c): %b%n", Character.isLetterOrDigit(c));
		System.out.printf("isLowerCase(c): %b%n", Character.isLowerCase(c));
		System.out.printf("isUpperCase(c): %b%n", Character.isUpperCase(c));

		System.out.printf("toUpperCase(c): %b%n", Character.toUpperCase(c));
		System.out.printf("toLowerCase(c): %b%n", Character.toLowerCase(c));
	}
}