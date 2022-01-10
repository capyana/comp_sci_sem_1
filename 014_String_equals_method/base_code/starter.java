import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Pick: Wizard, Warrior, or Rogue");
		String kevin=sc.nextLine();
		if(kevin.equals("Rogue")){
			System.out.println("You picked Rogue");
		}
		else if(kevin.equals("Wizard")){
			System.out.println("You picked Wizard");
		}
		else if(kevin.equals("Warrior")){
			System.out.println("You picked Warrior");
		}
		else{
			System.out.println("Input is incorrect");
		}
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this progra	Rectangle sam = new Rectangle(1.0, 2.0, 3.0, 4.0);
	}
}
2