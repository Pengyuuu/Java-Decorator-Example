
public abstract class Beverage {
	String description = "Unknown beverage";
	
	public String getDescription() {
		return description;
	}
	
	// Abstract because subclasses must implement
	public abstract double cost();
	
}
