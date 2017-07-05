public class StringBuilderMethods {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello, how are you?");

		System.out.printf("builder = %s%nlength = %d%ncapacity = %d%n%n", 
						builder.toString(), builder.length(), builder.capacity());

		builder.ensureCapacity(75);
		System.out.printf("New capacity = %d%n%n", builder.capacity());

		builder.setLength(10);
		System.out.printf("new length = %d%n builder = %s%n", builder.length(), builder.toString());
	}
}