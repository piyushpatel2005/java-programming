public class StudentTest {

	public static void main(String[] args) {
		Student account1 = new Student("Piyush Patel", 93.5);
		Student account2 = new Student("Zamira Mardanova", 72.25);

		System.out.printf("%s's letter grade is %s%n", account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is %s%n", account2.getName(), account2.getLetterGrade());
	}
}