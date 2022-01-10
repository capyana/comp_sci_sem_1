import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc =new Scanner(System.in);
	System.out.println("Guess a number!(1-1000)");
	int guess=sc.nextInt();
	while (guess!=45)
	{
		if(guess>45){
		System.out.println("Too high!Try again:P");
		guess=sc.nextInt();
		}	
			else if(guess<45){
		System.out.println("Too low!Try again.:P");
		guess=sc.nextInt();
		}
		
		
	}
	System.out.println("Good job!");
		
	}
}
