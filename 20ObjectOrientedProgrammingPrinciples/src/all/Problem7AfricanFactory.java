package all;

public class Problem7AfricanFactory implements Problem7ContinentalFactory {
	
	@Override
	public Problem7HerbivorousAnimal createHerbivorousAnimal() {
	        Problem7Rabbit rabbit = new Problem7Rabbit();
        return rabbit;
    }
	
	@Override
    public Problem7CarnivorousAnimal createCarnivorousAnimal() {
		Problem7Lion lion = new Problem7Lion();
        return lion;
    }

}
