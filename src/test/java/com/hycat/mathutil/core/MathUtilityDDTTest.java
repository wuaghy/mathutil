package com.hycat.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // chuẩn bị bộ data để riêng sau đó fill vào
    // mảng 2 chiều bào gồm giá trị kì vọng
    public static Object[][] initData(){
        // trả về 1 cái mảng
        // Object dataset = {}; //= {các phần tử của mảng cách nahu bằng dấu ,}
        Object[][] dataset = {{5,120},
                            {6,720},
                            {4,240},
                            {3,6},
                            {2,2},
                            {1,1},
                            {0,1}};//[7][2]
        return dataset;
    }
    @ParameterizedTest
    @MethodSource("initData")
    public  void  testFactorialGivenRightRunsWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
}