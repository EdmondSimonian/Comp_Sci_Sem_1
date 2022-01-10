import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("input number");
	int c = sc.nextInt();
	System.out.println("input number");
	int d = sc.nextInt();
	boolean crip;
	boolean opp;
	crip = (c != d);
	opp = (c == d);
	if (crip){
		System.out.println("kisses forehead and smiles");
	
	}
	if (opp){
		System.out.println("*in Bill Cosby voice* ´hey hey hey'");
	}
	}
}
