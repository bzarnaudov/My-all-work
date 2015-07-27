package all;

public class ReverseSentence {
	public static void main(String[] args) {
		String text = "C# is not C++ and PHP is not Delphi";
		String words[] = text.split(" ");
		String newText = "";
		for (int i = words.length-1; i >= 0; i--) {
			newText = newText + " " + words[i] ;
		}
		System.out.println(text);
		newText = newText.trim();
		System.out.println(newText); // reverse Sencence
		
		String text2 = "one\\two\\three"; // razdeliane s nakloneni na diasno
		System.out.println(text2);
		String text2New[] = text2.split("\\\\");
		for (String words1 : text2New) {
			System.out.println(words1);
		}
		
	}
}
