package airPort;
import java.util.Scanner;

public class Pilot extends Crew {
		/*--------------Properties-------------------*/

		private int Lisence;
		Scanner reader = new Scanner(System.in);
		
		/*--------------Constructors-------------------*/

		public Pilot() {
			System.out.println("name:");
			
			this.setName(reader.next());
			System.out.println("surname:");

			this.setSurname(reader.next());
			
			System.out.println("Lisence No.:");

			this.Lisence=reader.nextInt();
			System.out.println("Tenure:");

			this.setTenure(reader.nextInt());		}
		
		/*--------------Methods-------------------*/

		public void Print() {
			super.Print();
			System.out.println("Lisence no.: "+this.Lisence);
			
			
			
			
		}
}
