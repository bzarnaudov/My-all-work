package all;

public class Problem4Song {
    private String name;
    private int duration;

    // Create a constructor of the class
    public Problem4Song(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    // Create an overridden method to make the the information in the class     
    // into string 
    @Override
    public String toString() {
        return "Song name " + this.name + " duration " + 
                               this.duration + "seconds";
    }

}
