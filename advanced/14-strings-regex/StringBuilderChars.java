public class StringBuilderChars {
	public static void main(String[] args) {
		// String builder is not thread safe. for multithreading use StringBuffer
		StringBuilder builder = new StringBuilder("hello there");

		System.out.printf("builder = %s%n", builder.toString());
		System.out.printf("character at 0: %s%nCharacter at 4: %s%n", 
							builder.charAt(0), builder.charAt(4));

		char[] charArray = new char[builder.length()];
		builder.getChars(0, builder.length(), charArray, 0);

		System.out.print("The characters are : ");

		for(char ch: charArray) 
			System.out.print(ch);

		builder.setCharAt(0, 'H');
		builder.setCharAt(6, 'T');

		System.out.printf("%n%nbuilder = %s", builder.toString());

		builder.reverse();
		System.out.printf("%n%nbuilder = %s%n", builder.toString());
	}
}