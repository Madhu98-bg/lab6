package devops.DevOpsLab6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
    public class AppTest extends TestCase { 
    	private App app; 
    	public AppTest(String testName) { 
    	super(testName); 
    	this.app = new App(); 
    	} 
    	public void testFact0() { 
    	assertEquals("Factorial of 0 must be 1", 1, this.app.calculateFactorial(0)); 
    	} 
    	public void testFact5() { 
    	assertEquals("Factorial of 5 must be 120",0 , this.app.calculateFactorial(5)); 
    	} 
    	} 


