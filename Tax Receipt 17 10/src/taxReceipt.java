
public class taxReceipt {

	static int counter;
	final int id;
	final double payment;
	public taxReceipt(double payment) {
		
		this.payment = payment;
		this.id = counter;
		counter++;
	}
	
	
}
