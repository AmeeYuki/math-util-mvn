/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.yukiame.mathutil.core.test;

import com.yukiame.mathutil.core.MathUtility;
import java.lang.invoke.MethodHandle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ASUS
 */
public class MathUtilityDDTtest {

    //ta cần chuẩn bị bộ data đeer nhồi vào cái hàm qua 2 tham số
    ///đã chừa sẵn !!!!
    //kĩ thuật ntacsh data kiểm thử ra khỏi câu lệnh so sánh
    //để data ở riêng  1 chỗ, từ từ fill vào hàm so sánh
    //kĩ thuật này gọi là ddt data driven testing
    //data thường sẽ để ở mảng 2 chiều
    //1 cái là đầu vào N, 1 cái là Đầu ra expected
    //và có nhiều cặp như thế
    //kĩ thuật này còn gọi là tham số hóa kiểm thử
    //đưa data vào qua tham số hàm
    public static Object[][] initData() {
        Object[][] dataset = {{0, 1},
        {1, 1},
        {3, 6},
        {4, 24},
        {5, 120}};
        return dataset;
    }


@ParameterizedTest
@MethodSource("initData")
public void verifyFactorialGivenRightArgumentReturnsOK(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
