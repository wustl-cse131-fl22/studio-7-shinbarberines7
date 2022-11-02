package _1parts;

public class Rectangle {
	// instance variables
    private int length;
    private int width;
    
    // constructor
    public Rectangle(int thelength, int thewidth)
    {
       this.length = thelength;
       this.width = thewidth;
    }
    
    public int Area(){
    	return this.length*this.width;
    }
    
    public int Perimeter() {
    	return (2*this.length) + (2*this.width);
    }
    
    public static boolean isfirstRbigger(Rectangle rec_1, Rectangle rec_2) {
    	return rec_1.Area() > rec_2.Area();
    }

    public boolean isSquare() {
    	return this.length == this.width;
    }


	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(5, 10);
		Rectangle R2 = new Rectangle(4, 4);
		System.out.println(R1.Area());
		System.out.println(R1.Perimeter());
		System.out.println(isfirstRbigger(R1, R2));
		System.out.println(R1.isSquare());
		System.out.println(R2.isSquare());
	}

}
