public class ValueOf {
	public static void main(String[] args) {
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean boolValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 100000000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		Object objectRef = "hello";

		System.out.printf("char array = %s%n", String.valueOf(charArray));
		System.out.printf("part of char array = %s%n", String.valueOf(charArray, 3, 3));

		System.out.printf("boolean = %s%n", String.valueOf(boolValue));
		System.out.printf("char = %s%n", String.valueOf(characterValue));

		System.out.printf("int = %s%n", String.valueOf(integerValue));
		System.out.printf("float = %s%n", String.valueOf(floatValue));
		System.out.printf("long = %s%n", String.valueOf(longValue));
		System.out.printf("double = %s%n", String.valueOf(doubleValue));

		System.out.printf("Object = %s%n", String.valueOf(objectRef));
	}
}