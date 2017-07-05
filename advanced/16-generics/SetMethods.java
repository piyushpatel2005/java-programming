import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;


public class SetMethods {
	public static void main(String[] args) {
		String[] colors = {"red", "white", "blue", "green", "gray", 
							"orange", "tan", "white", "cyan", "peach", "gray", "orange"};

		List<String> list = Arrays.asList(colors);
		System.out.printf("List: %s%n", list);

		printNonDuplicates(list);
	}

	private static void printNonDuplicates(Collection<String> values) {
		Set<String> set = new HashSet<>(values);

		System.out.printf("%nNon duplicates are: ");

		for(String value: set)
			System.out.printf("%s ", value);

		System.out.println();
	}
}