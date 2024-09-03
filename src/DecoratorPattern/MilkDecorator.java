package DecoratorPattern;

public class MilkDecorator extends DecoratorCoffee{

	public MilkDecorator(ICoffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Milk";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 0.5;
	}

}
