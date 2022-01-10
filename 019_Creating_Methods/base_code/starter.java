import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Write a sentence!");
		String a=sc.nextLine();
		
		// Your code goes below here
		toString(a);
		System.out.println("Write a sentence!");
		String b = sc.nextLine();
		toStringCombined(a,b);
		
	}
	public static void toString(String c){
		System.out.println(c);
		
	}
		public static void toStringCombined(String c, String d){
		System.out.println(c + "  "+ d);
}
}
