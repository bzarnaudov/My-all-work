package all;

import java.util.*;

public class Problem4Album {
	private String tittle;
    private String genre;
    private int yearOfRelease;
    private int numberOFCopiesSold;
    private List<Problem4Song> songsInAlbum;

    // Create a constructor of the class
    public Problem4Album(String tittle, String genre, int yearOfRelease, int numberOfCopies) {
        this.tittle = tittle;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
        this.numberOFCopiesSold = numberOfCopies;
        this.songsInAlbum = new ArrayList<Problem4Song>();
    }
    
    // Method for adding new songs for every album
    public void addSongs(Problem4Song song) {
        songsInAlbum.add(song);
    }

    // Create an overridden method to make the the information in the class 
    // into string 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.tittle + '\n');
        sb.append(this.genre + '\n');
        sb.append("Year of release " + this.yearOfRelease + '\n');
        sb.append("Copies sold " + this.numberOFCopiesSold + '\n');

        for (Problem4Song song : songsInAlbum) {
            sb.append(song.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((tittle == null) ? 0 : tittle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Problem4Album other = (Problem4Album) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (tittle == null) {
			if (other.tittle != null)
				return false;
		} else if (!tittle.equals(other.tittle))
			return false;
		return true;
	}
}
