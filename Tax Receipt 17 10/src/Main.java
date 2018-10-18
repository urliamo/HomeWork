
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		taxReceipt[] receipts = new taxReceipt[8];
		
		for (int i=0; i<8; i++) {
			receipts[i]= new taxReceipt(Math.random()*20+80);
			System.out.println(receipts[i].payment+" "+receipts[i].id);
		}
		
	}

}
