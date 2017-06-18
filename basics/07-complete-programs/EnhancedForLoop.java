public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] array = {87, 68, 44, 66, 23};

		int total = 0;

		for (int number: array) {
			total += number;
		}

		System.out.printf("Total of array elements is %d%n", total);
	}
}