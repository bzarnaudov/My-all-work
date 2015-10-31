package all;

public class AbstractDataExample {

	public static void main(String[] args) {
		Lion lion = new Lion(true, 150);
		@SuppressWarnings("unused")
		Felidae bigCat1 = lion;
		AfricanLion africanLion = new AfricanLion(false, 105);
		@SuppressWarnings("unused")
		Felidae bigCat2 = africanLion;

	}

}
