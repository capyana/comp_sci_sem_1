import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		Scanner sd= new Scanner(System.in);
		System.out.println("What is your name?");
		String name=sc.nextLine();
		System.out.println("What is your title? Ex: Destroyers of Weebs");
		String title=sc.nextLine();
		System.out.println("Pick: Wizard, Warrior, or Rogue");
		String kevin=sc.nextLine();
		if(kevin.equalsIgnoreCase("Rogue")){
			System.out.println("You picked Rogue!");
		}
		
		else if(kevin.equalsIgnoreCase("Wizard")){
			System.out.println("You picked Wizard!");
		}
		else if(kevin.equalsIgnoreCase("Warrior")){
			System.out.println("You picked Warrior!");
		}
		else{
			System.out.println("Input is incorrect.Try again");
			
		
			System.out.println("Pick: Wizard, Warrior, or Rogue");
			String kevin1=sc.nextLine();
			if(kevin1.equalsIgnoreCase("Rogue")){
			System.out.println("You picked Rogue!");
		}
		
		else if(kevin1.equalsIgnoreCase("Wizard")){
			System.out.println("You picked Wizard!");
		}
		else if(kevin1.equalsIgnoreCase("Warrior")){
			System.out.println("You picked Warrior!");
		}
		}
		
		System.out.println("You have 25 points. Select traits for your character.You have a maximum of 10 Points each:\n Strength - Buff and able to carry larger items \n Dexterity - Agile and moves quickly \n Intelligence - Better at magic spells! \n Constitution - How much health \n Charisma - How personable ");
		System.out.println("How many points do you put into'Strength'");
		 int strength = sd.nextInt();
		 int total=0;
		 if(strength>10){
		 	System.out.println("Input is incorrect.Try again");
		 	System.out.println("How many points do you put into'Strength'");
			strength = sd.nextInt();
			total=25-strength;
					 	System.out.println("Strength + "+strength+"points. You have " +total+" points left.");

		 }
		 
		 else if (strength<=10){
			total=25-strength;
		 	System.out.println("Strength + "+strength+"points. You have " +total+" points left.");
		 }
		 	System.out.println("How many points do you put into'Dexterity'");
		 int dex = sd.nextInt();
		 boolean temp=true;
		 if(dex>10){
		 		System.out.println("Input is incorrect.Try again");
		 			System.out.println("How many points do you put into'Dexterity'");
			dex = sd.nextInt();
			total=25-dex;
					 	System.out.println("Dexterity + "+dex+"points. You have " +total+" points left.");

		 }
		 else if (dex<=10){
		 	total= total-dex;
		 	System.out.println("Dexterity + "+dex+"points. You have " +total+" points left.");
		 }
			System.out.println("How many points do you put into'Intelligence'");
		 int intell = sd.nextInt();
		 if(intell>10){
		 	System.out.println("Input is incorrect.Try again");
		 	System.out.println("How many points do you put into'Intelligence'");
			intell = sd.nextInt();
			total=total-intell;
			if(total<=0){
		 	System.out.println("You are out of points to spend");
		 	temp=false;
		 	intell=0;
			}
			else{
				System.out.println("Intelligence + "+intell+"points. You have " +total+" points left.");

			}
		 }
		 else if (intell<=10){
		 	total= total-intell;
		 	
		 	if(total<=0){
		 	System.out.println("You are out of points to spend");
		 	temp=false;
		 	intell=0;
		 	}
		 	else{
		 	System.out.println("Intelligence + "+intell+"points. You have " +total+" points left.");
		 	}
		 }
		 int con=0;
		 int c=0;
		if(temp){
		 	System.out.println("How many points do you put into'Constitution'");
		  con = sd.nextInt();
		 if(con>10){
		 	System.out.println("Input is incorrect.Try again");
		 		System.out.println("How many points do you put into'Constitution'");
			con = sd.nextInt();
			total=25-con;
			if(total<=0){
				System.out.println("You are out of points to spend");
				temp=false;
				con=0;
			}
			else{
				System.out.println("Constitution + "+con+"points. You have " +total+" points left.");
			}
		 }

		 else if (con<=10){
		 	total= total-con;
			if(total<=0){
				System.out.println("You are out of points to spend");
				temp=false;
				con=0;
			}
			else{
				System.out.println("Constitution + "+con+"points. You have " +total+" points left.");
			}		 	
		 }
		 
		 if(temp){
		 	System.out.println("How many points do you put into'Charisma'");
			c = sd.nextInt();
			 if(c>10){
			 	System.out.println("Input is incorrect.Try again");
			 	System.out.println("How many points do you put into'Charisma'");
				c = sd.nextInt();
				total=25-c;
				if(total<=0){
					System.out.println("You are out of points to spend");
					temp=false;
					c=0;
				}
				else{
					System.out.println("Charisma + "+c+"points. You have " +total+" points left.");
				}
			 }
			 else if (c<=10){
			 	total= total-c;
			 		if(total<=0){
					System.out.println("You are out of points to spend");
					temp=false;
					c=0;
				}
				else{
					System.out.println("Charisma + "+c+"points. You have " +total+" points left.");
				}

			 }
			}
		}
		 System.out.println("You are"+name+"of "+title);
		 System.out.println("You are a "+kevin+" with the following stats \n Strength-"+strength+" points \n Dexterity-"+dex+" points \n Intelligence-" +intell+" points \n Constitution-"+con+" points \n Charisma-" +c+" points");

		 
		 
		
	
	
		
	}
}
