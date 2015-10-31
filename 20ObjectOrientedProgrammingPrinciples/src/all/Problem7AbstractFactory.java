package all;

public class Problem7AbstractFactory {

	public static void main(String[] args) {
		Problem7ContinentalFactory africa = new Problem7AfricanFactory();
		Problem7AnimalWorld world = new Problem7AnimalWorld(africa);
        world.runFoodChain();

        Problem7ContinentalFactory america = new Problem7AmericanFactory();
        world = new Problem7AnimalWorld(america);
        world.runFoodChain();
	}

}
