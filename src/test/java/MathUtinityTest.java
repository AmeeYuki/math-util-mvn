/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.yukiame.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class MathUtinityTest {
    
   //Test case #1: Verify getFactorial(with n = 0)
    //Step/Procedures:
    //      1.Given n = 0;
    //      2. Call/Invoke getFactorial(n=0_
    //Expected result:
     //         The method musst return 1 ass the result of 0! = 1;
    // Status: Passed |FAILED cho lúc chạy hàm mới biết trang thái đúng sai
    
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOK(){
        assertEquals(1,MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOK(){
        assertEquals(1,MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOK(){
        assertEquals(120,MathUtility.getFactorial(5));
    }
    
    
    
    
    
    
}
