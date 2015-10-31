package all;

public class Problem7Lion implements Problem7CarnivorousAnimal {
	public void eat(Problem7HerbivorousAnimal herbivorousAnimal) {
		System.out.println(this.getClass().getName() + " eats " + 
					herbivorousAnimal.getClass().getName());
	}
}
