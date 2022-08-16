public class PermanentHire extends SalariedWorker{
	
	private static final int WEEKLY_SALARY_BONUS = 350;
	private static final int MONTHLY_PAY = 9500;
	
	
	private PermanentHire() {}
	
	
	public PermanentHire(String name, int social) {
		super(name,social,MONTHLY_PAY);
	}
	
	public PermanentHire(String name, int social, int MONTHLY_PAY) {
		super(name,social,MONTHLY_PAY);
	}
	
	public PermanentHire(String name, int social, int MONTHLY_PAY, int WEEKLY_SALARY_BONUS) {
		super(name,social,MONTHLY_PAY);
	}
	
	public PermanentHire(PermanentHire o) {
		this(o.getName(), o.getSocial());
	}

	public double calculateWeeklyPay() {
		return MONTHLY_PAY/4 + WEEKLY_SALARY_BONUS;
	}
}