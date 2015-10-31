package all;

import java.util.*;

public class Problem4CompanyArticles {

	public static void main(String[] args) {
		TreeMap<Double, Problem4Article> firmArticles = new TreeMap<Double, Problem4Article>();
		double startRange;
        double endRange;
        
        Scanner input = new Scanner(System.in);
        String[] priceRange = input.nextLine().split(" ");
        startRange = Double.parseDouble(priceRange[0]);
        endRange = Double.parseDouble(priceRange[1]);
        int merchandiseCount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < merchandiseCount; i++) {
            String[] articleInfo = input.nextLine().split("\\|");
            for (int j = 0; j < articleInfo.length; j++) {
            	articleInfo[j] = articleInfo[j].trim();
            }
            double articlePrice = Double.parseDouble(articleInfo[3]);
            Problem4Article currentArticle = new Problem4Article(articleInfo[0], articleInfo[1], articleInfo[2], articlePrice);
            firmArticles.put(articlePrice, currentArticle);
        }
        endRange += 0.001;
        SortedMap<Double, Problem4Article> searchedArticles = firmArticles.subMap(startRange, endRange);
        if (searchedArticles.size() == 0) {
        	System.out.println("No results found!");
        	input.close();
            return;
        }

        StringBuilder rezult = new StringBuilder();
        for (Map.Entry<Double, Problem4Article> article : searchedArticles.entrySet()) {
            rezult.append(article.getValue().toString() + "\n");
        }
        rezult = rezult.delete(rezult.length() - 2, rezult.length());
        System.out.println(rezult);
        input.close();
	}
}
