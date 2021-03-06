package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem4MainMusicalCompany {

	// Create a sample test to check if the classes are working properly with its       
    // methods
	public static void main(String[] args) {
		Scanner reader = null;
		try {
			reader =  new Scanner(new File("MusicCompany.txt"), "windows-1251");
	
	        List<Problem4Song> songs = new ArrayList<Problem4Song>();
	        List<Problem4Album> albums = new ArrayList<Problem4Album>();
	        List<Problem4Singer> singers = new ArrayList<Problem4Singer>();
	
	        String line = "";
	        String[] elements;
	        for (int i = 0; i < 2; i++) {
	        	while (true) {
	        		line = reader.nextLine();
	        		
	                if (line.equals("!")) {
	                	break;
	                }
	                
	                elements = line.split("-");
	                songs.add(new Problem4Song(elements[0], Integer.parseInt(elements[1])));
	            }
	        	line = reader.nextLine();
	            elements = line.split("-");
	            albums.add(new Problem4Album(elements[0], elements[1], 
	                      Integer.parseInt(elements[2]), Integer.parseInt(elements[3])));
	            
	            line = reader.nextLine();
	            elements = line.split("-");
	            singers.add(new Problem4Singer(elements[0], elements[1]));
	
	            int counter = 0;
	            for (Problem4Song song : songs) {
	            	albums.get(counter).addSongs(song);
	            }
	            singers.get(counter).addAlbum(albums.get(counter));
	            counter++;
	            songs.clear();
	        }
	        
	        line = reader.nextLine();
	        elements = line.split("-");
	        Problem4MusicalCompany virginiaRecords = 
	        		new Problem4MusicalCompany(elements[0], elements[1], elements[2]);
	        for (Problem4Singer singer : singers) {
	        	virginiaRecords.addArtist(singer);
	        }
	        System.out.println(virginiaRecords.toString());
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		} finally {
			if (!(reader == null)) {
				reader.close();
			}
		}
	}
}
