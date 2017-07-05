import java.io.File;
import java.util.Scanner;


public class FileDemonstration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter file or directory name: ");
		analyzePath(input.nextLine());
	}


	public static void analyzePath(String path) {
		File name = new File(path);

		if(name.exists()) {
			System.out.printf("%s exists%n", name.getName());
			System.out.printf("%s directory%n", name.isDirectory()? "is a" : "is not a");
			System.out.printf("%s absolute path", name.isAbsolute() ? "is an" : "is not an");
			System.out.printf("Last modified on : %s%n", name.lastModified());
			System.out.printf("Length: %s%n", name.length());
			System.out.printf("Absolute path: %s%n", name.getAbsolutePath());
			System.out.printf("Parent: %s%n", name.getParent());

			if(name.isDirectory()) {
				String[] directory = name.list();
				System.out.println("\n\nDirectory contents: \n");
				for (String directoryName: directory) 
					System.out.println(directoryName);
			}
		} else {
			System.out.printf("%s does not exist.", path);
		}
	}
}