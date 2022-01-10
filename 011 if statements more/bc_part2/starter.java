import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	int kevin=2000;
	int ali=2341;
	int tyana=2388;
	if (kevin>=ali&&kevin>=tyana){
		System.out.println(kevin+" is the largest number");
	}
	if (ali>=tyana&&ali>=kevin){
		System.out.println(ali+" is the largest number");
	}
	if (tyana>=ali&&tyana>=kevin){
		System.out.println(tyana+" is the largest number");
	}
		
	if (kevin<=ali&&kevin<=tyana){
		System.out.println(kevin +" is the smallest number");
	}
	if(ali<=tyana&&ali<=kevin){
		System.out.println(ali +" is the smallest number");
	}
	if(tyana<=ali&&tyana<=kevin){
		System.out.println(tyana +" is the smallest number");
	}
	}
}
