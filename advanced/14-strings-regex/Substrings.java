public class Substrings {
	public static void main(String[] args) {
		String letters = "abcdefghijklmnopqrstuvwxyz";

		System.out.printf("Substring from index 20 to end is '%s'%n", letters.substring(20));
		System.out.printf("Substring from index 3 and upto but not including 6 is '%s'%n", letters.substring(3, 6));
	}
}