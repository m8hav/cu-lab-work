package java.enumtypes.cardTrainersCode;


public enum Card {
		
	//card_type (annual_fee, card_limit, annual_salary) 
	DEBIT_CARD(100, 00.00, 50000.00),
	CREDIT_CARD(1000, 100000.00, 200000.00),
	SHOPPING(1500, 150000.00, 300000.00),
	BUSINESS(2500, 250000.00, 500000.00),
	INTERNATIONAL(5000, 500000.00, 1000000.00);


	private final int annual_fee;
	private final double card_limit;
	private final double annual_salary;
	

	//No public constructor in enum type
	private Card(int annual_fee, double card_limit, double annual_salary) {
		this.annual_fee = annual_fee;
		this.card_limit = card_limit;
		this.annual_salary = annual_salary;
	}

	protected int getAnnualFee() {
		return annual_fee;
	}
	
	protected double getCardLimit() {
		return card_limit;
	}
	
	protected double getAnnualSalary() {
		return annual_salary;
	}
	
	
	
}
