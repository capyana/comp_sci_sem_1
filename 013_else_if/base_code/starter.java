import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Pick a number between 1-1000");
		int hannah = sc.nextInt();
		if(hannah==768){
			System.out.println("Good guess!");
		}
		else{
			System.out.println("Guess again :(");
		}
		
	
	}
}
