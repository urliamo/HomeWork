package duplicateRemoval;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("enter string:");

		String stringToCut = reader.next();	
		//char charsToCut[] = stringToCut.toCharArray();
		System.out.println("enter second string:");

		String stringToRemove = reader.next();
		char charsToRemove[] = stringToRemove.toCharArray();
		
		for (char c : charsToRemove) {
			char newString[] = new char[stringToCut.length()];
			int current = 0;

			for (int i =0; i<stringToCut.length(); i++) {
				if (stringToCut.charAt(i)!=c) {
					newString[current]=stringToCut.charAt(i);
					current++;
				}
			}
			stringToCut= new String(newString);
		}
		
		System.out.println("new string: "+stringToCut);

		reader.close();
		
	}

}
