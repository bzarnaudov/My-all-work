package all;

public class Problem7AnimalWorld {
	
	private Problem7HerbivorousAnimal herbivorousAnimal;
	private Problem7CarnivorousAnimal carnivorousAnimal;

	public Problem7AnimalWorld(Problem7ContinentalFactory factory) {
		carnivorousAnimal = factory.createCarnivorousAnimal();
		herbivorousAnimal = factory.createHerbivorousAnimal();
	}

	public void runFoodChain() {
		carnivorousAnimal.eat(herbivorousAnimal);
	}

}
