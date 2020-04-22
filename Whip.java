
public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	// Get the beverage we want to wrap the condiment around and store it
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// extends CondimentDecorator so it must implement getDescription() and cost()
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public double cost() {
		return beverage.cost() + .10;
	}

}
