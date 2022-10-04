package RunnerClass;

import java.util.ArrayList;
import java.util.Scanner;

import Methods.BookTrade_1;
import Methods.EntityPojo;
import Methods.Exit;
import Methods.PrintTrades2;

public class RunnerMethod {
	
	public static void runnerMethod() {
		BookTrade_1 bt1=new BookTrade_1();
		PrintTrades2 pt1=new PrintTrades2();
		
		Exit e1=new Exit();
		System.out.println("l Book Trade - 1");
		System.out.println("l Print Trades - 2");
		System.out.println("l Exit - 3");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

			switch(n) {
			case 1: bt1.bookTrade();
				break;
			case 2:	pt1.printtingEntity();	
				break;
			case 3:e1.exit();
			    break;
			 
			default : // for invalid input
				System.out.println("Invalid option.\n"+"Please Enter the valided option ...!\n");
				runnerMethod();
				break;    
		}
	}

}
