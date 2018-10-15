package course;
import java.util.Scanner;



public class Student {
	
	Scanner reader = new Scanner(System.in);
	private int age;
	private int grade;
	private static int ageSum;
	private static int gradeSum;
	private static int numOfStudents;

	public static double getAverageAge() {
		return (ageSum/numOfStudents);
	}

	public static double getAverageGrade() {
		return (gradeSum/numOfStudents);
	}


	public Student(int age, int grade) {
		while (age<1) {
			System.out.println("invalid age, must be positive, enter again:");
			age = reader.nextInt();
		}
		this.setAge(age);
		while (grade<0 || grade>100) {
			System.out.println("invalid grade, must be between 0-100, enter again:");
			grade = reader.nextInt();
		}
		this.setGrade(grade);
		ageSum+=age;
		gradeSum+=grade;
		numOfStudents++;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
