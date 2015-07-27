package all;

public class ReplaceWordsWithStars {
	public static void main(String[] args) {
		String wordsForReplace = "Java,JVM,Microsoft";
		String text = "Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.";
		String fixedText = text;
		String wordForReplace[] = wordsForReplace.split(",");
		int n = wordForReplace.length;
		for (int i = 0; i < n; i++) {
			String stars = "";
			for (int k = 0; k < wordForReplace[i].length(); k++) {
				stars += "*";
			}
			 
			fixedText = fixedText.replace(wordForReplace[i], stars);
		}
		System.out.println(fixedText);
	}

}
