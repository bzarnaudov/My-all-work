package all;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ReplaceWholeWordsFromText {

	public static void main(String[] args) {
		Map<String, String> replaces = new HashMap<>();
		replaces.put("Go", "Og");
		replaces.put("go", "og");
		String input = "I am student. Go, go, go!";
		StringBuilder output = new StringBuilder();
		String delimiters = " .,!\t\n\r";
		StringTokenizer tokenizer = new StringTokenizer(input, delimiters, true);
		while( tokenizer.hasMoreTokens()) { 
			String token = tokenizer.nextToken();
			System.out.println(token);
			if (token.length() != 1 || delimiters.indexOf(token.charAt(0)) == -1) { 
				String newToken = replaces.get(token);
				token = newToken == null ? token : newToken; 
			} 
			output.append(token);
		} 
		System.out.println("output = " + output); 

	}

}
