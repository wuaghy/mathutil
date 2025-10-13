package com.hycat.mathutil.core.test;
//import static chỉ dành cho hàm static để giúp ta k cần gõ tên class
import com.hycat.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

//import static com.hycat.mathutil.core.MathUtility.getFactorial;
import static com.hycat.mathutil.core.MathUtility.*;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArg4RunsWell(){

        assertEquals(24, getFactorial(4));
    }
    @Test
    public void testFactorialGivenRightArg3RunsWell(){
        assertEquals(6, getFactorial(3));
    }
    @Test
    public void testFactorialGivenRightArg5RunsWell(){

        assertEquals(120, getFactorial(5));
    }
    @Test //@Test là một anotation báo hiệu rằng hàm nay là hàm main có thể run
    //1 class test có thể có nhiều @Test -> có nhiều hàm main tương ứng vs nhieefuf testcase khác nhau đều đc run
    // test case #1;: check/vetify getFactorial() method with valid parameter, e.g n=0
    // steps/procedure:
    //  1. given a valid m, e.g n=0
    //  2. call/invoke getFactorial(n=0)
    //  3. Execute
    // expected result:
    //  the method will return 1 as a result of 0!
    public void testFactorialGivenRightArg0RunsWell(){
        int n=0;
        long expectedValue = 1;//hope to see 0! = 1; kì vọng
        long actualValur = getFactorial(n);
        assertEquals(expectedValue, actualValur);
        // so sánh xem 0 giai thừa có trả về con số 1 hay k
        // hàm giúp so sánh nó trả về 2 màu:
        // xanh passed
        // đỏ fail
    }
}