package airPort;

import java.util.Scanner;

public class Passenger extends Person {
	
		/*--------------Properties-------------------*/

		private int Passport;
		Scanner reader = new Scanner(System.in);
		
		/*--------------Constructors-------------------*/

		public Passenger() {
	System.out.println("name:");
			
			this.setName(reader.next());
			System.out.println("surname:");

			this.setSurname(reader.next());
			
			System.out.println("Passport:");

			this.Passport=reader.nextInt();
		}
		
		/*--------------Methods-------------------*/

		public void Print() {
			super.Print();
			System.out.println("Passport: "+Passport);
		}
}
