package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem3Main {

	public static void main(String[] args) {
        Scanner reader = null;
        PrintStream writer = null;
        int startPointRow = 0;
        int startPointCol = 0;
	    try {
	    	reader = new Scanner(new File("Tests3\\test.001.in.txt"), "windows-1251");
	    	writer = new PrintStream(new File("Tests3\\test.001.out.txt"), "windows-1251");
		    
		    int n = 0;
	        int counterLines = 0;
	        String line = "";
	        Problem3WordLabirinth labirint = null;
	        
	        while (true) {
	            
	            if (reader.hasNextLine() == false) {
            		break;
                }
	            line = reader.nextLine();
	            
	            if (counterLines == 0) {
	                n = Integer.parseInt(line);
	                labirint = new Problem3WordLabirinth(n);
	                counterLines++;
	            } else {
	            	for (int i = 0; i < n; i++) {
	            		labirint.setMatrixElement(counterLines - 1, i, line.charAt(i));
			            if (line.charAt(i) == '*') {
			            	startPointRow = counterLines - 1;
	                        startPointCol = i;
			            }
	            	}
	                counterLines++;
	            }
	        }
        
	        labirint.setMatrixElement(startPointRow, startPointCol, 'a');
            labirint.findPathToExit(startPointRow,startPointCol);
            for (Entry<String, String> currentPath : labirint.getPaths().entrySet()) {
            	writer.println(currentPath.getKey());
            }
	    } catch (FileNotFoundException fnfe) {
        	System.err.println(fnfe.getMessage());
	    } catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
	    } finally {
	    	if (!(reader == null)) {
        		reader.close();
        	}
        	if (!(writer == null)) {
            	writer.close();
        	}
	    }
	}

}
