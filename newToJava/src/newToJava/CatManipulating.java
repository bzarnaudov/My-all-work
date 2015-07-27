package newToJava;

public class CatManipulating {
	public static void main(String[] args) {
		Cat myCat = new Cat();
//		myCat.setName("Alfred");
		System.out.printf("The name of my cat is %s.%n", myCat.getName());
		myCat.sayMiau();
		System.out.println(Cat.nextValue());
		System.out.printf("Sequence[1..3]: %d, %d, %d%n",
				Cat.nextValue(), Cat.nextValue(),
				Cat.nextValue());
//		System.out.println(myCat.nextValue());
	}
}
