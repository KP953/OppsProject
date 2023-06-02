
public class Pizza {
	private int prize;
	private boolean veg;
	private int extraCheesePrize=100;
	private int extraToppingsprice=150;
	private int bakPackPrice=20;
	private int basePizzaprice;
	private boolean isextraCheseAdded =false;
	private boolean isextraToppingAdded=false;
	private boolean isoptedForTakeAway=false;

	public Pizza(boolean veg) {
		super();
		this.veg = veg;
		if(this.veg) {
			this.prize=300;
		}
		else {
			this.prize=400;
		}
		basePizzaprice=this.prize;
	}
	public void addExtracheese() {
		isextraCheseAdded=true;
		this.prize += extraCheesePrize;

	}
	public void addextraToppings() {
		isextraToppingAdded=true;
		this.prize += extraToppingsprice;

	}
	public void takeAway() {
		isoptedForTakeAway=true;
		this.prize += bakPackPrice;

	}
	public void getBill() {
		String bill ="";
		System.out.println("Pizza: "+basePizzaprice);
		if(isextraCheseAdded) {
			bill += "extra cheese added :"+extraCheesePrize+ "\n";

		}
		if(isextraToppingAdded) {
			bill += "extra toppings added :"+extraToppingsprice+ "\n";

		}
		if(isoptedForTakeAway) {
			bill += "take away"+bakPackPrice+ "\n";

		}
		bill += "Bill: "+this.prize +"\n";
		System.out.println(bill);

	}

}







