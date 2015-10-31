package all;

public class Problem7Wolf implements Problem7CarnivorousAnimal {
	
	@Override
	public void eat(Problem7HerbivorousAnimal herbivorousAnimal) {
		System.out.println(this.getClass().getName() + " eats " + 
					herbivorousAnimal.getClass().getName());
	}

}
