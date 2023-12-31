/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.chinhchinh.uit.mathutil.test.core;

import com.chinhchinh.uit.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Trinh
 */

//câu lệnh này chỉ chơi với JUnit báo hiệu rằng sẽ cần loo[ qua tập dât để
//lấy các cặp dât input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //ta sẽ trả về mảng 2 chiều gồm nhiều cặp expected/Input
    @Parameterized.Parameters     //JUNit sẽ ngầm chạy loop qua từng dòng 
                                    //từng dong của mảng để lấy ra ddwc data i
                                     //input/expected
    public static Object[][] initData(){
        return new Integer[][]{
                        {0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {5, 120},
        };
    }
        //giả sử loop qua từng dòng của magnr, ta vẫn sẽ gán từng value của cột
        //vào biến tương ứng, expected để hồi feed cho hàm
        
        @Parameterized.Parameter(value = 0)    //value = 0 map với mảng data
        public int n; //biến map với value của cột 0 của mảng
        
        @Parameterized.Parameter(value = 1)
        public long expected; //kiểu long vì giá trị trả về của hàm getF()
                              //là long
    
        @Test
        public void testGetFactorialGivenRightArgumentReturnsWell(){
            
            Assert.assertEquals(expected, MathUtil.getFactorial(n));
        }
    
}
