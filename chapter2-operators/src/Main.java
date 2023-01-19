import java.math.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		//	|32|16|8|4|2|1
		int x = 8;
		x <<= 1; // shift left with one position 8 -> will be 16
		System.out.println(x);

		int Y = 8;
		Y >>= 1; // shift right with one position 8 -> will be 4
		System.out.println(Y);

		int z = 8;
		z >>>=1;
		System.out.println(z);

		int c = 8;
		c ^=1; // doing OR, will append t0 1000 to 0001, resulting 1001, meaning 9 in int type.
		System.out.println(c);

		int f = 11;
		f = ~f;
		System.out.printf("~ %d in binary %s", f, Integer.toBinaryString(f));

		int e = 8;
		e /= 2;
		System.out.println(e);

		returnValueofAssignement();

		ternaryexpression();
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