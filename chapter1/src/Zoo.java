public class Zoo {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}

	public static void secondMain(String args[]) {
		System.out.println("Hello World");
	}
	public static void thirdMain(String... args) {
		System.out.println("Hello World");
	}
}