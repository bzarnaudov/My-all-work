package all;

public class TransitiveInheritance {

	public static void main(String[] args) {
		AfricanLion africanLion = new AfricanLion(true, 15);
		// Method defined in Felidae
		africanLion.isMale();
		// Method defined in Felidae
		africanLion.setMale(true);

	}

}
