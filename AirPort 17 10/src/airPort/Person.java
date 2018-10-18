package airPort;
public abstract class Person {
		private String Name;
		private String Surname;
		
	

	
		/*--------------Setters-------------------*/

		public void setName(String name) {
			Name = name;
		}
		public void setSurname(String surname) {
			Surname = surname;
		}
		/*--------------Methods-------------------*/

		public void Print() {
			System.out.print("Name: "+this.Name+" Surname: "+this.Surname+" ");
		}
}
