package course;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int age;
		int grade;
		boolean lastStudent=false;
		
		// TODO Auto-generated method stub
		while (!lastStudent) {
			
		System.out.println("enter student age:");
		age = reader.nextInt();
		
		System.out.println("enter student grade:");
		grade = reader.nextInt();
		
		Student student = new Student(age, grade);
		System.out.println("enter another student? 1=yes, 2=no");
		lastStudent = (reader.nextInt()==1) ? false : true; 

		}
		
		System.out.println("student average grade is: "+Student.getAverageGrade()+", student average age is: "+Student.getAverageAge());
		reader.close();
	}

}
