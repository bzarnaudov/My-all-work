package all;

public class Problem1Worker extends Problem1Human implements Comparable<Problem1Worker>{
	
	private double wage;
	private double workedHours;
	
	public Problem1Worker(String name, String surname, double wage, double workedHours) {
		super(name, surname);
		this.wage = wage;
		this.workedHours = workedHours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(double workedHours) {
		this.workedHours = workedHours;
	}

	public double getWagePerHour() {
		return wage/workedHours;
	}

	@Override
	public String toString() {
		return "Problem1Worker [wage=" + wage + ", workedHours=" + workedHours
				+ ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ "wagePerHour " + getWagePerHour() + "]";
	}
	
	@Override
	public int compareTo(Problem1Worker other) {
		if (this.getWagePerHour() > other.getWagePerHour())	{
			return -1;
		} else if (this.getWagePerHour() < other.getWagePerHour()){
			return 1;
		}
		return 0;
	}
}
