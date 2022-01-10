import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("input a number");
		int a=sc.nextInt();
		System.out.println(a+" to the power of?");
		int b=sc.nextInt();
		System.out.println(pow(a,b));
		
	}
	public static int pow(int x,int y){
	int power= (int)Math.pow(x,y);
	return power;
	}
}
