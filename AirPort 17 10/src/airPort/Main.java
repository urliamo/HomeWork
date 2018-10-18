package airPort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[4];
		persons[0]= new Pilot();
		persons[1]= new Steward();
		persons[2]= new Usher();
		persons[3]= new Passenger();
		
		for (Person p : persons) {
			p.Print();
		}
		
		}

}
