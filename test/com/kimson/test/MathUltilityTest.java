/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimson.test;

import com.kimson.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thinkpro
 */
public class MathUltilityTest {
    @Test//biên hàm này thành main(), shift f6 để chạy
    //gọi hàm getFactorial() như thường lệ nhưng tự động so sáng giùm expected và ectual có khớp nhau không
    //nếu khớp thì màu xanh k khớp thì màu đỏ
    public void testFactorialRightArgumentRunsWell(){// hàm test đưa đúng tham số
        long expected=120;//kiểm tra xem 5! có bằng 120 không
        int n = 5;
        long actual=MathUtility.getFactorial(n);//Tính giá trị thực
        //so sáng
        assertEquals(expected, actual);
    }
    
}
