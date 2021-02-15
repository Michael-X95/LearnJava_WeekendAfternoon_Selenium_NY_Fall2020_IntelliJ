package unittesting;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;


public class CalculatorTest2 {

    @Test
    public void testDoSummation() {
        // Expected Result= 51
        int expectedResult = 51;
        int actualResult = Calculator.doSum(25, 26);
        // Verify expected Result vs Actual Result
        Assert.assertEquals("Test Fail",expectedResult,actualResult);
//        if (expectedResult == actualResult) {
//            System.out.println("Test pass");
//        } else {
//            System.out.println("Test Fail");
//        }

    }

    @Test(timeout = 100) @Ignore @Disabled
    public void testDoSub(){
        int expectedResult=-23;
        int actualResult=Calculator.doSubs(33,56);
        Assert.assertEquals("Test Fail",expectedResult,actualResult);

    }

    @Test(timeout = 40)
    public void testDoSub1(){ // Negative Testing
        int expectedResult=-24;
        int actualResult=Calculator.doSubs(33,56);
        Assert.assertNotEquals("Test Fail",expectedResult,actualResult);
    }





}