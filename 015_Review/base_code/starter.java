import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String head = sc.nextLine();
	System.out.println("\nWhat is your title, Ex: Slayer of Farts?");
	String toes = sc.nextLine();
	System.out.println("\nWhat is your role, Wizard, Warrior, Rouge?");
	String feet = sc.nextLine();
	String x = new String ("Wizard");
	String y = new String ("Warrior");
	String z = new String ("Rouge");
	boolean a;
	a = (feet.equals (x));
	boolean b;
	b = (feet.equals (y));
	boolean c;
	c = (feet.equals (z));
	
	if (a){
		System.out.println("Youre a wizard harry.");
	}
	else if (b){
		System.out.println("Youre a warrior.");
	
	}
	else if (c){
		System.out.println("You are a rogue.");
	}	

	else {
		System.out.println("You have decided not to choose a valid role");
	}
	
	int points = 25;
	
	System.out.println("You have 25 skill points to spend in the following: Big Boy Strength, Underwear Quality, Intelligence, Girth, and Charisma. Spend them wisely.");
	System.out.print("Big Boy Strength 1-10: ");
	int s = sc.nextInt();
	if (s > 10||s<1){
		System.out.println("Re Run Program");
	}
	
	points = (points - s);
	System.out.println("You have " + points + " points left. \n");
	
	
	System.out.print("Underwear Quality 1-10: ");
	s = sc.nextInt();
	if (s > 10||s<1){
		System.out.println("Re Run Program");
	}
	

	System.out.println("You have 0 points left to spend");
	points = (points -s);
	System.out.println("You have " + points + " points left. \n");
	System.out.print("Intelligence 1-10: ");
	s = sc.nextInt();
	if (s > 10||s<1){
		System.out.println("Re Run Program");
	}
	else if {
	System.out.println("You have 0 points left to spend");
	points = (points -s);
	System.out.println("You have " + points + " points left. \n");
	System.out.print("Girth 1-10: ");
	s = sc.nextInt();
	if (s > 10||s<1){
		System.out.println("Re Run Program");
	}

	else if {
	System.out.println("You have 0 points left to spend");
	points = (points -s);
	System.out.println("You have " + points + " points left. \n");
	System.out.print("Charisma 1-10: ");
	s = sc.nextInt();
	if (s > 10||s<1){
		System.out.println("Re Run Program");
	}
	
	else if {
	System.out.println("You have 0 points left to spend");
	points = (points -s);
	
	System.out.println("You are " + head + "with the title of " + toes + "and your role is " + feet );
	
	
	
	}
	}
	}
	}
	}
}
}