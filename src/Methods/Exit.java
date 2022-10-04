package Methods;

import java.util.Scanner;

import RunnerClass.*;

public class Exit {
	
	public static void exit() {
		Scanner s = new Scanner(System.in);

		System.out.println("Do you really want to exit (y/n)");
		String yORn = s.next();

		if (yORn.equalsIgnoreCase("y")) {
			System.out.println("Thank You So Much");
		} else if (yORn.equalsIgnoreCase("n")) {
			System.out.println("");
			RunnerMethod.runnerMethod();
		} else {
			System.out.println("Invalid data...!");
			exit();
		}
	}

}
