//TODO: document the code with comments
//and fix the setters so they don't invalidate the [0-255] rule
public class SimpleColor {
	private int r;
	private int g;
	private int b;
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		if( r <= 255 && r >= 0) {
			this.r = r;
		} 
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		if( g <= 255 && g >= 0) {
			this.g = g;
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if( b <= 255 && b >= 0) {
			this.b = b;
		}
	}

	public void setColor(int a, int b, int c) {
		setR(a);
		setG(b);
		setB(c);
	}
	public SimpleColor() {}
	
	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	
	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}
	
	public String toString() {
		return "r: " + r + ", g: " + g + ", b: ";
	}
	
	public boolean equals(Object o) {
		
		SimpleColor that = (SimpleColor) o;
		if( this.r == that.r && this.g == that.g && this.b == that.b) {
			return true;
		}
		return false;
	}
}
