package Methods;

import java.util.ArrayList;
import java.util.Scanner;

import RunnerClass.*;

public class BookTrade_1 {
	
	static int TradeNo=0;
	
	public String getCurrencyPairChecker() {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Currency Pair");
		String currPair1=sc.nextLine();
		String currPair=currPair1.toUpperCase();
		return currPair;
	}
	
	public String getCustName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer Name");
		String custName=sc.nextLine();
		return custName;
	}
	
	public double getAmount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to transfer");
		double amount=sc.nextInt();
		return amount;
	}

	public void bookTrade() {
		
		BookTrade_1 bt=new BookTrade_1();
		ArrayList<EntityPojo> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
     	//cust name
		String custName=bt.getCustName();
		while(!custName.matches("^[a-zA-Z\\s]*$")) {
			System.out.println("Enter the Valid name");
			bt.getCustName();
			break;
		}

		//currency pair
		String currPair=bt.getCurrencyPairChecker();
		while(!currPair.equals("USDINR") ) {
			System.out.println("Please enter valid currency Pair");
		 	bt.getCurrencyPairChecker();
		 	break;
		}
		

		//amount
		double amount=bt.getAmount();
		while(amount<=0) {
			System.out.println("Please enter valid amount");
			bt.getAmount();
            break;  
		}
		

		
		System.out.println("Do you want to get Rate\n"+"Press 1 if yes");
		int getRate = sc.nextInt();
        while(getRate != 1){
			RunnerMethod.runnerMethod();
		}
		double rate=66.00;
		double conversion = rate * amount;
		switch(getRate) {
			case 1:System.out.println("The rate is :"+rate);
			}
		
		
		
//		Book/Cancel
		
		System.out.println("Would u like to book the trade\n" +"Press 1 if yes or 2 to cancel");
		int book = sc.nextInt();
		
		switch(book) {
			case 1:System.out.println("Trade for USDINR has been booked with rate "+rate+ ", The amount of Rs " +conversion+" will  be transferred in 2 working days to "+ custName+"..");
			TradeNo++;			
			PrintTrades2.addEntity(TradeNo, currPair, custName, amount);
			System.out.println("Do another Exchange");
			RunnerMethod.runnerMethod();			
			break;

			case 2:System.out.println("Trade is Canceled.");
			RunnerMethod.runnerMethod();			
			break;
			}
		
		
	}
	

}
