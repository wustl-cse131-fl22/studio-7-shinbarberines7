package _1parts;

public class Die {
	// instance variable
	private int n_of_sides;
	
	// mutator method - setter
	public void setSides(int sides) {
		this.n_of_sides = sides;
	}
	
	public int result() {
		return (int) Math.ceil(Math.random()*this.n_of_sides);
	}
	
	public static void main(String[] args) {
		Die die1 = new Die();
		die1.setSides(10);
		System.out.println(die1.result());
	}

}
