package Methods;

import java.util.ArrayList;

import RunnerClass.*;

public class PrintTrades2 {
	
	static ArrayList <EntityPojo> ep=new ArrayList<>();
	static void addEntity(int TradeNo, String currPair, String custName, double amount) 
	{
		
		ep.add(new EntityPojo(TradeNo, custName,currPair, amount,66.00));
		
	
	}
	public static void printtingEntity() {
		System.out.println( "tradeNo\t" + "currencyPair\t "+ "customerName\t" + " amount\t    " + " rate\t");
		if(ep.isEmpty()) 
		{
			System.out.println("NO transation record present...!\n");
		}
	for(EntityPojo values : ep) 
	{
		System.out.println(values);
	}

	RunnerMethod.runnerMethod();

	}

}

