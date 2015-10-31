package all;

public class ToStringExample {

	public static void main(String[] args) {
		AfricanLion africanLion = new AfricanLion(true, 5);
		System.out.println(africanLion.toString());
		//Result: "all.AfricanLion@24cc17f1" if toString is not override
	}

}
