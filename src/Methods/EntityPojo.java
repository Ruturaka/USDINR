package Methods;

public class EntityPojo {
	int TradeNo ;
	private String name;
	private String CurrencyPair;
	private double amount;
	private double Rate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCurrencyPair() {
		return CurrencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		CurrencyPair = currencyPair;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public EntityPojo(int TradeNo ,String name, String currencyPair, double amount2,double rate) {
		super();
		this.TradeNo=TradeNo ;
		this.name = name;
		CurrencyPair = currencyPair;
		this.amount = amount2;
		this.Rate=rate;
	}
	
	@Override
	public String toString() {
		return "EntityPojo [TradeNo=" + TradeNo + ", name=" + name + ", CurrencyPair=" + CurrencyPair + ", amount="
				+ amount + ", Rate=" + Rate + "]";
	}
	

	
	
	

}
