package chapter11.examples;

import chapter11.Cat;
import chapter11.Sequence;

public class Glaven {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Cat lari = new Cat();
		System.out.println(Sequence.nextValue());
		System.out.println(Sequence.nextValue());
		System.out.println(Sequence.nextValue());
		System.out.println(Sequence.nextValue());
		System.out.println(Sequence.nextValue());
	}
}
