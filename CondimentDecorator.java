
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
	
	// Because this class is abstract it doesn't need to implement cost
	// But any concrete condiment decorator will have to because cost is abstract in beverage

}
