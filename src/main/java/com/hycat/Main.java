package com.hycat;

import com.hycat.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenRightArgNegative5ThrowException();
    }
    // test case #1;: check/vetify getFactorial() method with valid parameter, e.g n=0
    // steps/procedure:
    //  1. given a valid m, e.g n=0
    //  2. call/invoke getFactorial(n=0)
    //  3. Execute
    // expected result:
    //  the method will return 1 as a result of 0!
    public static void testFactorialGivenRightArg0RunsWell(){
        int n=0;
        long expectedValue = 1;//hope to see 0! = 1; kì vọng
        long actualValur = MathUtility.getFactorial(n);
        // test nè, so sánh actual vs expected
        System.out.println(expectedValue == actualValur ? "true" : "false");
    }

    // test case #2;: check/vetify getFactorial() method with valid parameter, e.g n=5
    // steps/procedure:
    //  1. given a valid m, e.g n=5
    //  2. call/invoke getFactorial(n=5)
    //  3. Execute
    // expected result:
    //  the method will return 120 as a result of 120!
    public static void testFactorialGivenRightArg5RunsWell(){
        int n=5;
        long expectedValue = 120;//hope to see 5! = 120; kì vọng
        long actualValur = MathUtility.getFactorial(n);
        // test nè, so sánh actual vs expected
        System.out.println(expectedValue == actualValur ? "true" : "false");
    }

    // test case #3;: check/vetify getFactorial() method with valid parameter, e.g n=6
    // steps/procedure:
    //  1. given a valid m, e.g n=6
    //  2. call/invoke getFactorial(n=6)
    //  3. Execute
    // expected result:
    //  the method will return 120 as a result of 6!
    public static void testFactorialGivenRightArg6RunsWell(){
        int n=6;
        long expectedValue = 720;//hope to see 6! = 720; kì vọng
        long actualValur = MathUtility.getFactorial(n);
        // test nè, so sánh actual vs expected
        System.out.println(expectedValue == actualValur ? "true" : "false");
    }

    // test case #4;: check/vetify getFactorial() method with invalid parameter, e.g n= -5
    // steps/procedure:
    //  1. given a valid m, e.g n= -5
    //  2. call/invoke getFactorial(n= -5)
    //  3. Execute
    // expected result:
    //  the method will return throw an exception
    // Status:
    //  passed hay failed đoán xem, chạy app đã !!
    public static void testFactorialGivenRightArgNegative5ThrowException(){
        int n= -5;
        MathUtility.getFactorial(n);
        //passed vì kì vọng ngoại lệ xh, và ngoại lệ xảy ra thật
        //thấy ngoại lệ là passed là tình huống ta thiết kế hàm sẽ xảy ra ngoại lệ với số âm giai thừa
    }
}