import java.util.Arrays;
import java.time.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("------Chapter 4------");

		//		manipulatingStrings();

		//		usingStringBuilderClass();

		//		understandingEquality();

		//		understandingArrays();

		//		calculatingWithMathAPIs();

		workingWithDatesAndTimes();
	}

	private static void workingWithDatesAndTimes() {
		System.out.println("------Working with Dates and Times-------");

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

		var date1 = LocalDate.of(2022, Month.JANUARY, 20);
		var date2 = LocalDate.of(2022, 1, 20);

		var time1 = LocalTime.of(6, 15);              // hour and minute
		var time2 = LocalTime.of(6, 15, 30);          // + seconds
		var time3 = LocalTime.of(6, 15, 30, 200);     // + nanoseconds

		var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
		var dateTime2 = LocalDateTime.of(date1, time1);

		var zone = ZoneId.of("US/Eastern");
		var zoned1 = ZonedDateTime.of(2022, 1, 20,
				6, 15, 30, 200, zone);
		var zoned2 = ZonedDateTime.of(date1, time1, zone);
		var zoned3 = ZonedDateTime.of(dateTime1, zone);

		var date = LocalDate.of(2024, Month.JANUARY, 20);
		var time = LocalTime.of(5, 15);
		var dateTime = LocalDateTime.of(date, time)
				.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime);

		var annually = Period.ofYears(1);            // every 1 year
		var quarterly = Period.ofMonths(3);          // every 3 months
		var everyThreeWeeks = Period.ofWeeks(3);     // every 3 weeks
		var everyOtherDay = Period.ofDays(2);        // every 2 days
		var everyYearAndAWeek = Period.of(1, 0, 7);  // every year and 7 days

		System.out.println(Period.of(1,2,3));

		System.out.println(Period.ofMonths(3));
	}

	private static void calculatingWithMathAPIs() {

		System.out.println("------Calculating with Math APIs-------");

		int first = Math.max(3, 7);   // 7
		int second = Math.min(7, -9); // -9

		long low = Math.round(123.45);       // 123
		long high = Math.round(123.50);      // 124
		int fromFloat = Math.round(123.45f); // 123

		double c = Math.ceil(3.14);  // 4.0
		double f = Math.floor(3.14); // 3.0

		double squared = Math.pow(5, 2); // 25.0
		System.out.println(squared);
		double squared1 = Math.pow(16, .5); // 4.0 - it is sqrt ?
		System.out.println(squared1);

		double num = Math.random();
		System.out.println(num);
	}

	private static void understandingArrays() {
		System.out.println("------Understanding Arrays-------");

		int[] moreNumbers = new int[]{42, 55, 99};
		int[] moreNumbers1 = {42, 55, 99}; // anonymous array

		int[] numAnimals;
		int[] numAnimals2;
		int[] numAnimals3;
		int numAnimals4[];
		int numAnimals5[];

		String[] bugs = {"cricket", "beetle", "ladybug"};
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString());    // [Ljava.lang.String;@160bc7c0
		System.out.println(Arrays.toString(bugs));

		int[] numbers1 = {6, 9, 1};
		Arrays.sort(numbers1);
		for (int i = 0; i < numbers1.length; i++)
			System.out.print(numbers1[i] + " ");

		String[] strings = {"10", "9", "100"};
		Arrays.sort(strings);
		for (String s : strings)
			System.out.print(s + " ");

		int[] numbers = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers, 9)); // -5

		System.out.println(Arrays.compare(new int[]{1}, new int[]{2}));


		System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));
		System.out.println(Arrays.mismatch(new String[]{"a"},
				new String[]{"A"}));
		System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));

		String[][] rectangle = new String[3][2];
		rectangle[0][1] = "set";

		var twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println();                  // time for a new row
		}

		for (int[] inner : twoD) {
			for (int num : inner)
				System.out.print(num + " ");
			System.out.println();
		}
	}

	private static void understandingEquality() {
		System.out.println("------Understanding Equality-------");

		var one = new StringBuilder();
		var two = new StringBuilder();
		var three = one.append("a");
		System.out.println(one == two);   // false
		System.out.println(one == three); // true

		// JVM String pool
		var x = "Hello World";
		var y = "Hello World";
		System.out.println(x == y); // true

		var x1 = "Hello World";
		var z = " Hello World".trim();
		System.out.println(x1 == z); // false

		var name = "Hello World";
		var name2 = new String("Hello World").intern();
		System.out.println(name == name2); // true

		var first = "rat" + 1;
		var second = "r" + "a" + "t" + "1";
		var third = "r" + "a" + "t" + new String("1");
		System.out.println(first == second);
		System.out.println(first == second.intern());
		System.out.println(first == third);
		System.out.println(first == third.intern());
	}

	private static void usingStringBuilderClass() {

		System.out.println("------Stringbuilder-------");
		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha.append(current);
		System.out.println(alpha);

		var sb = new StringBuilder().append(1).append('c');
		sb.append("-").append(true);
		System.out.println(sb);      // 1c-true

		var sb1 = new StringBuilder("abcdef");
		sb1.delete(1, 3);                   // sb = adef
		sb1.deleteCharAt(5);

		var builder = new StringBuilder("pigeon dirty");
		builder.replace(3, 6, "sty");
		System.out.println(builder);  // pigsty dirty

		String s = sb.toString();
	}

	public static void manipulatingStrings() {
		String names = """
				Flutty""";
		System.out.println(names);


		// concatenation

		System.out.println(1 + 2);           // 3
		System.out.println("a" + "b");       // ab
		System.out.println("a" + "b" + 3);   // ab3
		System.out.println(1 + 2 + "c");     // 3c
		System.out.println("c" + 1 + 2);     // c12
		System.out.println("c" + null);

		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);

		// string methods
		var name = "animals";
		System.out.println(name.length());

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(6));

		System.out.println(name.indexOf('a'));       // 0
		System.out.println(name.indexOf("al"));      // 4
		System.out.println(name.indexOf('a', 4));    // 4
		System.out.println(name.indexOf("al", 5));   // -1

		System.out.println(name.substring(3));                 // mals
		System.out.println(name.substring(name.indexOf('m'))); // mals
		System.out.println(name.substring(3, 4));              // m
		System.out.println(name.substring(3, 7));

		System.out.println(name.toUpperCase());   // ANIMALS
		System.out.println("Abc123".toLowerCase());

		System.out.println("abc".equals("ABC"));            // false
		System.out.println("ABC".equals("ABC"));            // true
		System.out.println("abc".equalsIgnoreCase("ABC"));

		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false

		System.out.println("abc".endsWith("c"));   // true
		System.out.println("abc".endsWith("a"));   // false

		System.out.println("abc".contains("b"));   // true
		System.out.println("abc".contains("B"));   // false
		System.out.println("abc".indexOf("B") != -1);

		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc

		char ch = '\u2000';
		System.out.println(ch);

		System.out.println("abc".strip());                 // abc
		System.out.println("\t   a b c\n".strip());        // a b c

		String text = " abc\t ";
		System.out.println(text.trim().length());          // 3
		System.out.println(text.strip().length());         // 3
		System.out.println(text.stripLeading().length());  // 5
		System.out.println(text.stripTrailing().length()); // 4

		System.out.println("----INDENT----");
		var block = """
				a
				 b
				c""";
		var concat = " a\n"
				+ "  b\n"
				+ " c";
		System.out.println(block.length());                 // 6
		System.out.println(concat.length());                // 9
		System.out.println(block.indent(1).length());       // 10
		System.out.println(concat.indent(-1).length());     // 7
		System.out.println(concat.indent(-4).length());     // 6
		System.out.println(concat.stripIndent().length());  // 6

		var str = "1\\t2";
		System.out.println(str);                    // 1\t2
		System.out.println(str.translateEscapes()); // 1    2

		System.out.println(" ".isEmpty()); // false
		System.out.println("".isEmpty());  // true
		System.out.println("  ".isBlank()); // true
		System.out.println("".isBlank());  // true

		var nameK = "Kate";
		var orderId = 5;

		// All print: Hello Kate, order 5 is ready
		System.out.println("Hello " + nameK + ", order " + orderId + " is ready");
		System.out.println(String.format("Hello %s, order %d is ready",
				nameK, orderId));
		System.out.println("Hello %s, order %d is ready"
				.formatted(nameK, orderId));

		var pi = 3.14159265359;
		System.out.format("[%f]", pi);      // [3.141593]
		System.out.format("[%12.8f]", pi);  // [  3.14159265]
		System.out.format("[%012.8f]", pi); // [003.14159265]
		System.out.format("[%012f]", pi);   // [00003.141593]
		System.out.format("[%12.2f]", pi);  // [        3.14]
		System.out.format("[%.3f]", pi);    // [3.142]
	}
}