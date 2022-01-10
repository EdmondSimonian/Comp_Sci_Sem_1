import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	   Random rand = new Random();
	  int rand_c = rand.nextInt(10);
	  int rand_b = 1 + rand.nextInt(100);
	  double rand_a = 2.5+3.5*rand.nextDouble();
	  double rand_d = 14+rand.nextDouble() + rand.nextInt(575);
	System.out.println(rand_c);
	System.out.println(rand_b);
	System.out.println(rand_a);
	System.out.print(rand_d);
}
	
}
