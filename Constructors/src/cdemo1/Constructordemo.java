package cdemo1;

public class Constructordemo {

	private int x;
	private int y;
	
	public Constructordemo(String name) {
		
		System.out.println("Hello Constructor "+name);
	}
	
	public Constructordemo(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int add() {
		return x+y;
	}
	
	public int multiply() {
		return x*y;
	}
}
