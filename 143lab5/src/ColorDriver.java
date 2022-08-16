
/*
 * Lab Driver for ColorWithAlpha
 * 
 *  
 */

public class ColorDriver {
	
	public static void main(String[] args) {
		testColorWithAlpha();
	}
	
	public static void testColorWithAlpha() {
		ColorWithAlpha a = new ColorWithAlpha(50);
		ColorWithAlpha b = new ColorWithAlpha(100,100,100,150);
		ColorWithAlpha c = new ColorWithAlpha(b);
		
		
		System.out.println( "a is " + a);
		System.out.println( "b is " + b.toString());
		System.out.println( "c is " + c.toString());
		
		
		Test("a does NOT equal c " , !a.equals(c));
		Test("b equals c" , b.equals(c));
		
		System.out.println("Now we should get two exceptions raised:");
		//try some bad alpha values for exception handling
		try {
			a.setAlpha(300);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.setAlpha(-3);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	/**
     * Test
     * ----
     * This is just a function to make testing things easier.
     * @param testDescription : A string representing what you're going to test
     * @param testPasses: the test itself. When you call this method, 
     *                    you'll put some expression here that will evaluate
     *                    to true if your test passes.
     * PRE: none
     * POST: will print to the console the testDescription and either
     *       "Test PASSED" or "Test FAILED", depending on whether the test
     *       passed or failed.
     */
    public static void Test(String testDescription, boolean testPasses){
        if (testPasses) 
            System.out.println("Test PASSED: " + testDescription);
        else 
            System.out.println("Test FAILED: " + testDescription);
    }
	
}
