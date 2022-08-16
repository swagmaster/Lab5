import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.color.*;
import java.awt.geom.Ellipse2D;


public class YourClass extends Shape{
	
	private final int RADIUS = 20;
	private final int DENSITY = 10;
	
	private double radius;
	private Color myColor;
	
	public Color getColor() {
		return myColor;
	}
	
	public void setColor(Color newColor) {
		this.myColor = newColor;
	}

	
	public YourClass(int x, int y) {
		super(x,y);
		
	}

	public double getRadius() {
		return this.radius;
	}

	
	public void setR(double radius) {
		this.radius = radius;
	}

	public double getArea(double radius) {
		return Math.PI * radius * radius;
	}

	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		final int x = getX();
		final int y = getY();
		
		g2d.setColor( Color.RED );
		g2d.setPaint( new GradientPaint( x, y, Color.RED, x + RADIUS/4, y + RADIUS/4, Color.GREEN, true) );
		
		int xOffset = 0;
		int yOffset = 0;
		for( int i = 0; i < DENSITY; i++) {
			xOffset = (int) (Math.random()*RADIUS);
			yOffset = (int) (Math.random()*RADIUS);
			
			g2d.drawRect( 300, 400, 500, 600 );
			int width = 200;
			int height = 200;
			boolean raised = true;
			g2d.draw3DRect(xOffset, yOffset, width, height, raised);
			g2d.drawLine(70, 40, 90, 81);
		}
	}
}