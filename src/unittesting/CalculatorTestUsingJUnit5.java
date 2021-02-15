package unittesting;


import org.junit.Assert;


import org.junit.Ignore;
import org.junit.jupiter.api.*;


public class CalculatorTestUsingJUnit5 {

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

    @Test() @Disabled
    public void testDoSub(){
        int expectedResult=-23;
        int actualResult=Calculator.doSubs(33,56);
        Assert.assertEquals("Test Fail",expectedResult,actualResult);

    }

    @Test() @DisplayName("We are testing do Sub")
    public void testDoSub1(){ // Negative Testing
        int expectedResult=-24;
        int actualResult=Calculator.doSubs(33,56);
        Assert.assertNotEquals("Test Fail",expectedResult,actualResult);
    }


    @BeforeEach
    public void startUnitTesting(){
        System.out.println("Start Unit Testing");
    }

    @AfterEach
    public void endUnitTesting(){
        System.out.println("End Unit Testing");
    }

    @BeforeAll
    public static void welcome(){
        System.out.println("Welcome to Unit Testing");
    }

    @AfterAll
    public static void goodBye(){
        System.out.println("GoodBye from Unit Testing");
    }


}