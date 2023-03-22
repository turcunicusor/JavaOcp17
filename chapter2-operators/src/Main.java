import java.math.*;

public class Main {
	public static void main(String[] args) {
		int pig = (short)4;
		int pig2 = (short)3;
		pig2 = pig++;
		System.out.println(pig);
		System.out.println(pig2);
	}

	private static void ternaryexpression() {

		int sheep = 1;
		int zzz = 1;
		int sleep = zzz<10 ? sheep++ : zzz++;
		System.out.printf("Ternary expression: %d, %d, %d", sheep, zzz, sleep );
		boolean x = true;
		x =  false ^ false;
	}

	private static void returnValueofAssignement() {
		long wolf = 5;
		long coyote = (wolf= 3);
		System.out.println("Return value of the assignement");
		System.out.println(wolf);
		System.out.println(coyote);
	}
}