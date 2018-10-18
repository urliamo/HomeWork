package airPort;

public abstract class Crew extends Person {

	
	private int Tenure;
	
	public void setTenure(int tenure) {
		Tenure = tenure;
	}

	public void Print() {
		super.Print();
		System.out.print("Tenure: "+this.Tenure+" ");
	}
}
