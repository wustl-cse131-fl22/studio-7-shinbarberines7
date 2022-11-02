package _1parts;

public class Fraction {
	// instance variable
	private int numerator;
	private int denominator;
	
	// constructor
	public Fraction(int thenumerator, int thedenominator) {
		this.numerator = thenumerator;
		this.denominator = thedenominator;
	} 

	// accessor methods - getters
	public int getNumberator() {return this.numerator;}
	public int getDenominator() {return this.denominator;} 
	
	// addition
	
	public static String addition(Fraction F1, Fraction F2) {
		return ((F1.getNumberator()*F2.getDenominator())+(F2.getNumberator()*F1.getDenominator())) + "/" + (F1.getDenominator()*F2.getDenominator());
	}
	
	// multiplication
	
	public static String multiplication(Fraction F1, Fraction F2) {
		return ((F1.getNumberator()*F2.getNumberator()) + "/" + (F1.getDenominator()*F2.getDenominator()));
	}
	
	// reciprocal
	
	public static String reciprocal(Fraction F1) {
		return ((-1*F1.getDenominator() + "/" + F1.getNumberator()));
	}

	// simplification
	public static String Simplification(Fraction F1) {
		int N = F1.getNumberator();
		int D = F1.getDenominator();
		while (D != 0) {
			int temp = D;
			D = N % D;
			N = temp;
		}
		return F1.getNumberator()/N + "/" + F1.getDenominator()/N;		
	}
	

	public static void main(String[] args) {
		Fraction F1 = new Fraction(6, 10);
		Fraction F2 = new Fraction(1, 2);
		System.out.println(addition(F1, F2));
		System.out.println(multiplication(F1, F2));
		System.out.println(reciprocal(F1));
		System.out.println(Simplification(F1));
	}

}
