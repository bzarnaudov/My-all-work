package all;

public class Problem7AmericanFactory implements Problem7ContinentalFactory {
   
	@Override
	public Problem7HerbivorousAnimal createHerbivorousAnimal() {
		Problem7Bison bison = new Problem7Bison();
        return bison;
    }

	@Override
    public Problem7CarnivorousAnimal createCarnivorousAnimal() {
		Problem7Wolf wolf = new Problem7Wolf();
        return wolf;
    } 

}
