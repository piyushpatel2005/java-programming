import java.util.Scanner;


public class GradeBookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		GradeBook gradeBook1 = new GradeBook("CS 101 Intro to Java Programming");
		GradeBook gradeBook2 = new GradeBook("CS 102 Data Structures in Java");
		
		System.out.printf("gradebook1 course name is %s%n", gradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is %s%n", gradeBook2.getCourseName());
	}
}
