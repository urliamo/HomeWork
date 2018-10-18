package airPort;

import java.util.Scanner;

public class Steward extends Crew {
	
		/*--------------Properties-------------------*/

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

			this.setTenure(reader.nextInt());
			System.out.println("Origin:");

			this.Origin=reader.next();
			System.out.println("Class:");

			this.flightClass=reader.next();
		
		}
		/*--------------Methods-------------------*/

		public void Print() {
			super.Print();
			System.out.println("Origin: "+Origin+" Class: "+flightClass);
		}

}
