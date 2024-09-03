package DecoratorPattern;

public class Driver {
	public static void main(String[] args) {
		
		ICoffee coffee = new BaseCoffee();
		System.out.println(coffee.getDescription() + " cost $" + coffee.getPrice());
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription() + " cost $" + coffee.getPrice());
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription() + " cost $" + coffee.getPrice());

	}	
}
