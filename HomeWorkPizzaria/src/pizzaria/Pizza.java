package pizzaria;

import java.util.Scanner;

public class Pizza {
	Scanner reader = new Scanner(System.in);

	private double diameter;
	private int slices;
	private int toppings;
	
	

	public Pizza() {
		System.out.print("How big would you like this pizza (between 20 and 50 cm)?");
		this.setDiameter(reader.nextDouble());
		while (this.getDiameter()<20 || this.getDiameter()>50) {
			System.out.print("invalid size, please choose again (between 20 and 50 cm)");
			this.setDiameter(reader.nextDouble());
		}
		System.out.print("How many slices would you like (between 1 and 8)?");
		this.setSlices(reader.nextInt());
		while (this.getSlices()<1 || this.getSlices()>8) {
			System.out.print("invalid amount, please choose again (between 1 and 8 cm)");
			this.setSlices(reader.nextInt());
		}
		System.out.print("How many toppings would you like (between 0 and 5)?");
		this.setToppings(reader.nextInt());
		while (this.getToppings()<0 || this.getToppings()>5) {
			System.out.print("invalid amount, please choose again (between 0 and 5 cm)");
			this.setToppings(reader.nextInt());
		}
	}
	public boolean isBasic() {
		if (this.getToppings()>0) 
		{
			return(false);
		}
		else
		{
			return (true);
		}
		
	
	}
	public void print() {
		System.out.println("Pizza diameter is: "+this.getDiameter());
		System.out.println("Pizza has "+this.getSlices()+" slices");
		System.out.println("Pizza has "+this.getToppings()+" toppings");
	}
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
	}
}
