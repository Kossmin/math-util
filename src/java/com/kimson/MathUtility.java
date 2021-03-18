/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimson;

/**
 *
 * @author Thinkpro
 */
public class MathUtility {
    //đây là class mô phỏng lại class Math, chứa các hàm xài chung 
    //đây là hàm xàu chung, ko lưu lại điều gì +>static

    public static final double PI = 3.1415;

    //hàm tính giai thừa
    //hàm giai thừa tăng rât nhanh nên 21! sẽ tràn bộ nhớ
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");// đưa ra exception khi n không thuộc khoảng giá trị
        }

        if (n == 0 || n == 1) {
            return 1;//0!,1!= 1
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
