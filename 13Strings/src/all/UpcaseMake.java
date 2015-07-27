package all;

public class UpcaseMake {
	public static void main(String[] args) {
		String text = "We are living in a <upcase>yellow submarine</upcase>. We don't have anything" + 
				 " else. Inside <upcase>the submarine</upcase> is very tight. So we are drinking all" +
				 " the day. We <upcase>will move</upcase> out of it in 5 days.";
		System.out.println(text);
		text = findTagsAndChange(text);
		System.out.println(text);
	}

	private static String findTagsAndChange(String text) {
		int fromIndex = 0;
		String textReturn = text;
		String tag = "<upcase>";
		String tagEnd = "</upcase>";
		int index = text.indexOf(tag , fromIndex);
		while (index != -1) {
			index += tag.length();
			int indexEnd = text.indexOf(tagEnd, index);
			String upperCase = text.substring(index, indexEnd).toUpperCase();
			textReturn = textReturn.replace(tag + text.substring(index, indexEnd) + tagEnd, upperCase);
			index = text.indexOf(tag , index - tag.length() + upperCase.length());
		}	
		return textReturn;
	}
	
	

}
