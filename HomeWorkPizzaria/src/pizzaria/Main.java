package pizzaria;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza[] order = new Pizza[5];
		int totalToppings = 0;
		for (int i=0; i<order.length; i++) {
			order[i] = new Pizza();
		}
		int i=1;
		for (Pizza p : order) {
			System.out.println("Pizza no."+i);
			i++;
			totalToppings+=p.getToppings();
			if (p.isBasic()) {
				System.out.println("Pizza is basic");
			}
			else
			{
				System.out.println("Pizza is not basic");

			}
			p.print();
		}
		System.out.println("total amount of toppings is: "+totalToppings);

	}

}
