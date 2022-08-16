

public class ColorWithAlpha extends SimpleColor {

	 
	private int alpha;
	private ColorException badValue = new ColorException();

	
	public ColorWithAlpha(int alpha){
		super(0,0,0);
		setAlpha(alpha);
	}

	public ColorWithAlpha(int alpha, int r, int g, int b){
		super(r, g, b);
		setAlpha(alpha);
	}

	
	public ColorWithAlpha(ColorWithAlpha cwa){
		this(cwa.alpha);
	}

	
	public int getAlpha(){	
		return this.alpha;	
	}

	
	public void setAlpha(int alpha){
		if(alpha < 0 || alpha > 255){
			System.out.println(badValue);
		}else{
			this.alpha = alpha;
		}
	}
	
	public boolean equals(ColorWithAlpha other){
		return (this.alpha == other.alpha && this.toString().equals(other.toString()));
	}

	
	public String toString() {
		return super.toString() + ", alpha:"+ alpha;
	}
}