
public class Main {
	public static void main(String[] args) {
		
		Beverage beverage = new DarkRoast();
		
		// Pass it to the whip constructor to create a whip decorator
		// Store it in type beverage so we can continue to decorate it
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		// getDescription() is called on the outermost decorator, the Whip decorator. Whip delegates to the drink it's wrapping to get the
		// description, and adds comma whip. Mochas do the same until the inner mocha delegates to the dark roast 
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}

}
