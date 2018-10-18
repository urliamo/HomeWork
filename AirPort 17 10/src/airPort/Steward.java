package airPort;

import java.util.Scanner;

public class Steward extends Person {
	
		/*--------------Properties-------------------*/

		private int Tenure;
		private String Origin;
		private String flightClass;
		Scanner reader = new Scanner(System.in);
		/*--------------Constructors-------------------*/

			public Steward() {
			System.out.println("name:");
			
			this.setName(reader.next());
			System.out.println("surname:");

			this.setSurname(reader.next());
			
			System.out.println("Tenure:");

			this.Tenure=reader.nextInt();
			System.out.println("Origin:");

			this.Origin=reader.next();
			System.out.println("Class:");

			this.flightClass=reader.next();
		
		}
		/*--------------Methods-------------------*/

		public void Print() {
			super.Print();
			System.out.println("Tenure: "+Tenure+" Origin: "+Origin+" Class: "+flightClass);
		}

}
