package all;

import java.util.ArrayList;

public class Shuffle52000Cards {
	public static void main(String[] args) {
		ArrayList<Card> cards = new ArrayList<Card>();
		String[] allFaces = new String[] { "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "J", "Q", "K", "A" };
		Suit[] allSuits = new Suit[] { Suit.CLUB, Suit.DIAMOND, Suit.HEART,
				Suit.SPADE };
		for (int count = 1; count <= 1000; count++) {
			for (String face : allFaces) {
				for (Suit suit : allSuits) {
					Card card = new Card(face, suit);
					cards.add(card);
				}
			}
		}
		long oldTime = System.currentTimeMillis();
		CardsShuffle.shuffleCards(cards);
		long newTime = System.currentTimeMillis();
		System.out.printf("Execution time: %d ms",
		newTime - oldTime);
//		CardsShuffle.printCards(cards);
	}
}