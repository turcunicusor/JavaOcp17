import pond.Penguin;
import pond.Snake;

public class Main {
	public static void main(String[] args) {

//		desingningMethods();
//
//		declaringLocalAndInstanceVariables();
//
//		varargs();
//
//		staticClasses();

		trickyStatic();
	}

	private static void trickyStatic() {
		// other example

		System.out.println(Snake.hiss);

		Snake s = new Snake();
		System.out.println(s.hiss);
		s = null;
		System.out.println(s.hiss);
	}

	private static void staticClasses() {
		var p1 = new Penguin();
		p1.name = "Lilly";
		p1.nameOfTallestPenguin = "Lilly";
		var p2 = new Penguin();
		p2.name = "Willy";
		p2.nameOfTallestPenguin = "Willy";

		System.out.println(p1.name);                  // Lilly
		System.out.println(p1.nameOfTallestPenguin);  // Willy
		System.out.println(p2.name);                  // Willy
		System.out.println(p2.nameOfTallestPenguin);  // Willy
	}

	private static void varargs() {
		// Pass an array
		int[] data = new int[]{1, 2, 3};
		walk1(data);

		// Pass a list of values
		walk1(1, 2, 3);
	}

	public static void walk1(int... steps) {
		int[] step2 = steps; // Not necessary, but shows steps is of type int[]
		System.out.print(step2.length);
	}

	public static void declaringLocalAndInstanceVariables() {

	}

	private static void desingningMethods() {
	}
}