import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("input number between 1 and 5");
	int quu = sc.nextInt();
	int rand_que = 1 + rand.nextInt(5);
	boolean abe;
	abe =(quu > rand_que);
	boolean babe;
	babe =(quu < rand_que);
	boolean cabe;
	cabe =(quu == rand_que);
	if (abe){
		System.out.println("too high");
	
	}
	if (babe){
		System.out.println("2 lo");
		

	}
	if (cabe){
		System.out.println("correct");
	}
	}
}