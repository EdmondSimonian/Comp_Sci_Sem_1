import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("input number between 1 and 1000");
	int quu = sc.nextInt();
	int rand_que = 1 + rand.nextInt(1000);
	boolean abe;
	abe =(quu != rand_que);
	boolean bbe;
	bbe =(quu == rand_que);
	if (abe){
		System.out.println("try again");
	
	}
	if (bbe){
		System.out.println("correct");
	}
	}
}
	

