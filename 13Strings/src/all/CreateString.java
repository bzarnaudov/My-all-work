package all;

public class CreateString {
	public static void main(String[] args) {
		String numbersOtDo = new String("Numbers are : ");
		for ( int i = 1; i <= 1446; i++) {
			numbersOtDo += i;
		}
		System.out.println(numbersOtDo);
	}
}