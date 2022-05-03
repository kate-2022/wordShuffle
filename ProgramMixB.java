import java.util.Scanner;

public class ProgramMixB {

	public static void main(String[] args) {
	
		mixMethodOne();
	
		mixMethodTwo();
		
		mixMethodThree();

	}

	// Attribute
		private static String word;
		private static String substring;
		private static String substring2;
		private static char tempChar1;
		private static char tempChar2;

		private static int temp;
		private int length;
		private static int halfLength;
		private static int lastThree;
		
		
		//Methoden
		
		public static String mixMethodOne() {
			
		System.out.println("Bitte geben Sie ein Wort Ihrer Wahl ein!");	
			Scanner scan = new Scanner(System.in);
		    word = scan.next();	    
			tempChar1 = word.charAt(0);
			tempChar2 = word.charAt((word.length()-1));
			substring = word.substring(1,(word.length()-1));
			word = tempChar2+substring+tempChar1;
			System.out.println(word);
			return word;
			
		}

		public static String mixMethodTwo() {
			System.out.println("Bitte geben Sie ein Wort Ihrer Wahl ein!");	
			Scanner scan = new Scanner(System.in);
		    word = scan.next();	
		    temp = word.length();
		    halfLength = (temp/2);
		    substring = word.substring(0,halfLength);
		    substring2 = word.substring(halfLength,word.length());
		    word = substring2 + substring;
		    System.out.println(word);
		   
		    return word;
		}

		public static String mixMethodThree() {
			System.out.println("Bitte geben Sie ein Wort Ihrer Wahl ein!");	
			Scanner scan = new Scanner(System.in);
		    word = scan.next();	
		    temp = word.length();
		    substring = word.substring(0,word.length()-3); 
		    substring2 = word.substring(word.length()-3,word.length());
			substring2 = substring2.toUpperCase();
			word = substring + substring2;
			System.out.println(word);
			return word;
		}


	
}
