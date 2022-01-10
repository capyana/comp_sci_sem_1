import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Is it raining today? yes or no");
		String sophia= sc.nextLine();
		if(sophia.equals("yes")){
			System.out.println("You should bring an umbrella.");
		}
		else{
		System.out.println("You should bring sunscreen.:)");
		}
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	}
}
