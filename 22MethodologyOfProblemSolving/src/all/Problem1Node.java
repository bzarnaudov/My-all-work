package all;

public class Problem1Node implements Comparable<Problem1Node>{
	
	private int num;
	private int cos;
	
	public Problem1Node() {
		this.num = 0;
		this.cos = 0;
	}
	
	public Problem1Node(int num, int cos) {
		super();
		this.num = num;
		this.cos = cos;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getCos() {
		return cos;
	}
	
	public void setCos(int cos) {
		this.cos = cos;
	}
	
	@Override
	public int compareTo(Problem1Node other) {
		if (this.cos > other.cos)	{
			return 1;
		} else if (this.cos < other.cos){
			return -1;
		}
		return 0;
	}
	
}
