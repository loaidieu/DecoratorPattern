package DecoratorPattern;

public class SugarDecorator extends DecoratorCoffee{

	public SugarDecorator(ICoffee coffee) {
		super(coffee);
	}
	
	public String getDescription()
	{
		return super.getDescription() + ", Sugar";
	}
	
	public double getPrice()
	{
		return super.getPrice() + 0.3;
	}
}
