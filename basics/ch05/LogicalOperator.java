public class LogicalOperator {
	public static void main (String[] args) {
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
						"Conditional AND &&", "false && false", (false && false),
						"false && true", (false && true),
						"true && false", (true && false),
						"true && true", (true && true));
	}
}
