package DecoratorPattern;

public class BaseCoffee implements ICoffee{

	@Override
	public String getDescription() {
		return "Coffee";
	}

	@Override
	public double getPrice() {
		return 2.00;
	}

}
