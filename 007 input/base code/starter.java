import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name:");
		String rwe = sc.nextLine();
		System.out.println("Age:");
		int swe = sc.nextInt();
		System.out.println("Birth Month:");
		int gwe = sc.nextInt();
		System.out.println("Birthday Day:");
		int ywe = sc.nextInt();
		System.out.println("Birthday Year:");
		int twe = sc.nextInt();
		System.out.println("How much is a buck fifty:");
		double hwe = sc.nextDouble();
		System.out.println("Your name is " + rwe + " you were born " + gwe +"/"+ywe+"/"+twe);
		System.out.println("You are " + swe + " years old");
		System.out.println("You have " + hwe + " in your wallet");
	}
}
