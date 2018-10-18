package airPort;

import java.util.Scanner;

public class Usher extends Crew {
	
	/*--------------Properties-------------------*/

	private String Origin;
	private String Assignment;
	Scanner reader = new Scanner(System.in);
	/*--------------Constructors-------------------*/

	public Usher() {
		System.out.println("name:");

		this.setName(reader.next());
		System.out.println("surname:");

		this.setSurname(reader.next());
		
		System.out.println("Tenure:");

		this.setTenure(reader.nextInt());
		System.out.println("Origin:");

		this.Origin=reader.next();
		System.out.println("Assignment:");

		this.Assignment=reader.next();
	}
	/*--------------Methods-------------------*/

	public void Print() {
		super.Print();
		System.out.println("Origin: "+Origin+" Assignment: "+Assignment);
	}
}
