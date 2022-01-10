import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character playerchar= new Character();
		System.out.println("Your role is "+playerchar.role());
		System.out.println("Strengh is "+playerchar.str());
		System.out.println("Dexterity is "+playerchar.dex());
		System.out.println("Intelligence is "+playerchar.intel());
		System.out.println("Constitution is "+playerchar.con());
		System.out.println("Charisma is "+playerchar.ch());
		
	}
}
