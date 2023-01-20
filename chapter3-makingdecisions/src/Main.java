import java.time.Month;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		Number nr = 7;
		compareIntegers(nr);
		printIntegersGreaterThan5(nr);

		switchexpression(Month.FEBRUARY);
		secondSwitchExpression(Month.MAY);
	}

	private static void switchexpression(Month month) {
		var result = switch (month) {
			case JANUARY: {
				yield "Winter";
			}
			default: {
				yield "have to learn";
			}
		};
		System.out.println(result);
	}

	private static void secondSwitchExpression(Month month) {
		switch(month) {
			case MAY -> System.out.println("may");
		}
	}

	private static void thirdSwitchExpression() {
		int fish = 5;
		int length = 12;
		var name = switch(fish) {
			case 1 -> "Goldfish";
			case 2 -> {yield "Trout";}
			case 3 -> {
				if(length > 10) yield "Blobfish";
				else yield "Green";
			}
			default -> "Swordfish";
		};
	}

	public static void compareIntegers(Number number) {
		if (number instanceof Integer) {
			Integer data = (Integer) number;
			System.out.println(data.compareTo(5));
		}
	}

	public static void printIntegersGreaterThan5(Number number) {
		if (number instanceof Integer data && data.compareTo(5) > 0)
			System.out.println(data);
	}

}