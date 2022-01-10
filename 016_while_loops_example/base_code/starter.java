import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc=new Scanner(System.in);
	System.out.println("What is your name?");
	String name=sc.nextLine();
	System.out.println("How many times should this be repeated?");
	int repeat=sc.nextInt();
	int count= 0;
	 while (count<repeat)
	 {
	 	System.out.println(name);
	 	count++;
	 }




		
	}
}
