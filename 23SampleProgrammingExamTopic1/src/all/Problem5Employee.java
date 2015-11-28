package all;

public class Problem5Employee {
    private String name;
    private String duty;
    private double experience;

    // Crate a public constructor of the class
    public Problem5Employee(String name, String duty, double experience) {
        this.name = name;
        this.duty = duty;
        this.experience = experience;
    }

    //Create an overridden method to represent the information from the class 
    // into a string
    @Override
    public String toString() {
        return "Name of employee " + this.name + '\n' + "Duty " +
               this.duty + '\n' + "Experience " + this.experience;
    }

}
