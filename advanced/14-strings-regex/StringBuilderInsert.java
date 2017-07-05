public class StringBuilderInsert {
	public static void main(String[] args) {
		Object objectRef = "hello";
		String str = "goodbye";
		int intValue = 4;

		StringBuilder builder = new StringBuilder();

		builder.insert(0, objectRef);
		builder.insert(0, "");
		builder.insert(0, str);
		builder.insert(0, "");
		builder.insert(1, intValue);
		builder.insert(1, "");

		System.out.printf("builder after inserts: %n%s%n", builder.toString());

		builder.deleteCharAt(0);
		System.out.printf("builder after delete at 0: %n%s%n", builder.toString());
		builder.delete(2,6);
		System.out.printf("builder after deletes from 2 to 6: %n%s%n", builder.toString());
	}
}