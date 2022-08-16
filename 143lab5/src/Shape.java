import java.awt.*;

class Shape extends Object {
	
	private int x = 0;
	private int y = 0;
	
	public Shape( int a, int b ) {
		x = a;
		y = b;
	}
	
	public double getArea(){ 
		return x*y;
	}
	
	public void draw( Graphics g ){
		
	}
	
	
	public int getX() { 
		return x; 
	}
	public int getY() {
		return y; 
	}
	
	public void setX(int x) {	
		this.x = x;
	}
	public void setY(int y) {	
		this.y = y;	
	}
}