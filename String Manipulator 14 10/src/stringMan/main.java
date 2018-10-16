package stringMan;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter string:");

		String stringToCut = reader.next();	
		System.out.println("enter part length:");

		int parts = reader.nextInt();
		while (stringToCut.length()%parts!=0) {
			System.out.println("part length does not divide string equaly, choose again:");

			 parts = reader.nextInt();
		}
		int partLength = stringToCut.length()/parts;
		String newString[] = new String[parts];
		for (int i =0 ; i<parts; i++) {
			newString[i]= stringToCut.substring(0, partLength-1);
			stringToCut=stringToCut.substring(partLength-1);
		}
		for (String s : newString) {
			System.out.println(s);
		}
		reader.close();
	}
	
	
	

}
