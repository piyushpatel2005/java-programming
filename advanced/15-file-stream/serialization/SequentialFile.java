import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class SequentialFile {
	private static ObjectOutputStream output;


	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
	}


	public static void openFile() {
		try {
			output = new ObjectOutputStream(
				Files.newOutputStream(Paths.get("clients.ser")));
		}
		catch(IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}


	public static void addRecords() {
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter account number, first name, last name and balance%n");
		System.out.println("Enter end-of-file to end input(Ctrl+Z for UNIX and Ctrl+D for Windows)");

		while(input.hasNext()) {
			try {
				Account record = new Account(input.nextInt(),
					input.next(), input.next(), input.nextDouble());

				output.writeObject(record);
			}

			catch(NoSuchElementException elementException) {
				System.err.println("Invalid input. Please try again.");
				input.nextLine();
			}
			catch(IOException ioException) {
				System.err.println("Error writing to file. Terminating...");
				break;
			}

			System.out.print("Next? ");
		}
	}


	public static void closeFile() {
		try {
			if(output != null) 
				output.close();
		}
		catch(IOException ioException) {
			System.err.println("Error closing file. Terminating.");

		}
	}
}