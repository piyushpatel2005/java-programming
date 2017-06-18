import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CreateTextFile {
	private static Formatter output;

	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
	}

	public static void openFile() {
		try {
			output = new Formatter("clients.txt");
		}

		 catch(SecurityException  securityException) {
		 	System.err.println("Write permission denied, Terminating...");
		 	System.exit(1);
		 }
		 catch(FileNotFoundException fileNotFoundException) {
		 	System.err.println("Error opening file. Terminating...");
		 	System.exit(1);
		 }
	}

	public static void addRecords() {
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter account number, first name, last name and balance.%n" +
						"Enter end-of-file indicator to end input(Ctrl+Z for UNIX and Ctrl+D for Windows): %n");

		while(input.hasNext()) {
			try {
				int account = input.nextInt();
				String firstName = input.next();
				String lastName = input.next();
				double balance = input.nextDouble();
				System.out.printf("New record: %d %s %s %.2f%n", account, firstName, lastName, balance);
				String out = output.format("%d %s %s %.2f%n", account,
							firstName, lastName, balance);
				System.out.println(out);
			}
			catch(FormatterClosedException formatterClosedException) {
				System.err.println("Error writing to file. Terminating...");
				break;
			}
			catch(NoSuchElementException elementException) {
				System.err.println("Invalid input. Please try again.");
				input.nextLine();
			}

			System.out.println("Next? ");
		}
	}

	public static void closeFile() {
		if(output != null)
			output.close();
	}
}