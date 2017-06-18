public class StringBuilderAppend {
	public static void main(String[] args) {
		Object objectRef = "hello";
		String str = "goodbye";
		char[] charArray = {'a', 'b', 'c', 'd'};
		boolean boolValue = true;
		char charValue = 'Z';
		int intValue = 7;
		long longValue = 1000000000000L;
		float floatValue = 2.4f;
		double doubleValue = 33.333;
		StringBuilder lastBuilder = new StringBuilder("last built");
		StringBuilder builder = new StringBuilder();

		builder.append(objectRef)
				.append("\n")
				.append(str).append("\n")
				.append(charArray).append("\n")
				.append(boolValue).append("\n")
				.append(intValue).append("\n")
				.append(longValue).append("\n")
				.append(longValue).append("\n")
				.append(floatValue).append("\n")
				.append(doubleValue).append("\n")
				.append(lastBuilder).append("\n");

		System.out.printf("builder contains %n%s%n", builder.toString());
	}
}