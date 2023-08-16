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
 /*  public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //kết thúc cuộc chơi sớm nếu nhận đầu vào đầu vào đặc biệt
        
        long product = 1; //tích nhân dồn, 
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }*/
    
    //Học đệ quy trong vòng 30s
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //Ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn nữa, nhở hơn nữa,... đến điểm dừng
    
    //tính dùm tui 6!
    //n! = 1.2.3.4.5.6.7....n
    //6! = 6 x 5!
    //5/ = 5 X 4!
    //...
    //2! = 2 x 1!
    //quy ước 1! = 0! = 1
    //1! = 1
    
    //chốt hạ: n! = n * (n - 1)!
    public static long getFactorial(int n){
        
       if (n < 0 || n > 20)
           throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        
       if (n == 0 || n == 1)
           return 1; //kết thúc cuộc chơi sớm nếu nhận đầu vào đầu vào đặc biệt
        
        return n * getFactorial(n - 1); //công thức đệ quy
    }
    
}
