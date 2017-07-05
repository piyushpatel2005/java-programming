public class IndexMethods {
	public static void main(String[] args) {
		String letters = "abcdefghijklmnopqrstuvwxyz";

		System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
		System.out.printf("'a' is located at index %d%n", letters.indexOf('a'));
		System.out.printf("'$' is located at index %d%n", letters.indexOf('$'));

		System.out.printf("Last 'c' is located at index %d%n", letters.lastIndexOf('c'));
		System.out.printf("Last '$' is located at index %d%n", letters.lastIndexOf("$"));

		System.out.printf("'def' is located at index %d%n", letters.indexOf("def"));
	}
}