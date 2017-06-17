import java.util.Scanner;


public class AssertionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 10: ");
		int number = input.nextInt();

		assert(number >= 0 && number <= 10);

		System.out.printf("You entered %d%n", number);
	}
}

// To enable assertion run the program using 'java -ea AssertionTest'