import java.time.Month;

public class Main {
	public static void main(String[] args) {
		var tailFeathers= 7;
		switch (tailFeathers) {
			default: System.out.print("default" + " ");
			case 1: System.out.print(3 + " ");
			case 3: System.out.print(5 + " ");
		 }
	}


	private static void thee() {
		int temperature = 4;
		long humidity = -temperature + temperature * 3;
		if (temperature>=4)
			if (humidity < 6) System.out.println("Too Low");
		else System.out.println("Just Right");
		else System.out.println("Too High");


	}


}