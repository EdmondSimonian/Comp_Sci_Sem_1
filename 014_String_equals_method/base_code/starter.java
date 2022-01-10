import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("type Hayk Akopyan' ");
	String feet = sc.nextLine();
	String x = new String ("Wizard");
	String y = new String ("Warrior");
	String z = new String ("Rouge");
	String cutie = new String ("Hayk Akopyan");
	boolean sigma;
	sigma = (feet.equals (cutie));
	boolean a;
	a = (feet.equals (x));
	boolean b;
	b = (feet.equals (y));
	boolean c;
	c = (feet.equals (z));
	
	if (a){
		System.out.println("Youre a wiazrd harry");
	}
	else if (b){
		System.out.println("Youre a warrior go die for your pitiful 3rd world country");
	
	}
	else if (c){
		System.out.println("Youre a rouge, youre not apart of the leftist zionist agenda to feminize all men");
	}	
	else if (sigma || feet.equals("Hayk")){
		System.out.println("https://www.youtube.com/watch?v=QB7ACr7pUuE");
	}
	

	else {
		System.out.println("You had one job");
	}
	}
}