/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinhchinh.uit.mathutil.core;

/**
 *
 * @author Trinh
 */
public class MathUtil {
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //kết thúc cuộc chơi sớm nếu nhận đầu vào đầu vào đặc biệt
        
        long product = 1; //tích nhân dồn, 
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}
