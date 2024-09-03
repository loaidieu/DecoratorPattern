package DecoratorPattern;

public abstract class DecoratorCoffee implements ICoffee{
	protected ICoffee reference;
	
	public DecoratorCoffee(ICoffee coffee) {
		this.reference = coffee;
	}
	
	public String getDescription() {
		return reference.getDescription();
	}
	
	public double getPrice()
	{
		return reference.getPrice();
	}
}
