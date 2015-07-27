package all;

import java.util.Random;

public class Psuvni {

	private static Random rnd = new Random();
	
	public static void main(String[] args) {
		
		System.out.println(deistvie()
				+ " " + dopulnenie() 
				+ " " + epitet()
				+ " " + epitet()
				+ " " + obrushtenie());
	}
	
	private static String deistvie() {
		String[] deistvie = {"shte te eba v", "shte ti go nachukam v", "sha ta shibam v",
				"ti go tura v"}; 
		return deistvie[rnd.nextInt(deistvie.length)];
	}




	private static String dopulnenie() {
		String[] dopulnenie = {"ushite", "ustata", "nosa", "putkata", "guzut"};
		return dopulnenie[rnd.nextInt(dopulnenie.length)];
	}

	private static String epitet() {
		String[] epitet = {"smahnat", "smeshen", "glamav", "kriv", "naeban"};
		return epitet[rnd.nextInt(epitet.length)];
	}

	private static String obrushtenie() {
		String[] obrushtenie = {"glupak", "prostak", "shibidak", "idiot", "sersemin"};
		return obrushtenie[rnd.nextInt(obrushtenie.length)];
	}
	
	
}
