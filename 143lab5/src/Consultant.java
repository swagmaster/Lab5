public class Consultant extends HourlyWorker{
	
	private static final int CONSULTANT_HOURLY_WAGE = 3;

	
	private Consultant() {}

	
	public Consultant(String name, int social) {	
		super(name,social,CONSULTANT_HOURLY_WAGE);	
		}

	
	public Consultant(String name, int social, double hourlyPay) {	
		super(name,social,hourlyPay);	
	}

	
	public double calculateWeeklyPay() {	
		return CONSULTANT_HOURLY_WAGE * 20 * 5;	
	}
}