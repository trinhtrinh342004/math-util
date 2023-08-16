/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.chinhchinh.uit.mathutil.test.core;

import com.chinhchinh.uit.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Trinh
 */
public class MathUtilityTest {
    // đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    //để kiểm thứ/kiểm tra code chính - hàm tinhsGiaiThua() bên
    //class core.MathUtil
    //viết code để test code chính bên kia!!!
    
    //có quy tắc đặt tên hàm kiểm thử là nói lên mục đích của case/tình huống
    //kiểm thử
    
    //hàm dười đây là tình huống hàm chạy thành công, trả về ngon
    //ta sẽ xài kiểu hàm well - đưa 5!, 6!, ko chơi -5!, 50!
    
    //@Test JUnit sẽ phối hợp với IVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //có nhiều @Tes ứng với nhiều case khác nhau để kiểm thử tính giai thừa
   @Test
   public void testGetFactorialGivenRightArgumentReturnsWell(){
       int n = 0; //test thử tính huống tử tế đầu vào, và mày phải chạy đúng
       long expected = 1; // hy vọng 0! = 1
       
       // long actual = ; gọi hàm cần test bên core/app chính/code chính
       long actual = MathUtil.getFactorial(n);
       
       //so sánh expected vs actual dùng xanh xanh đỏ đỏ, framework
       org.junit.Assert.assertEquals(expected, actual);
       
       
       //gộp thêm vài case thành công/đưa vào ngon!!!
       org.junit.Assert.assertEquals(1, MathUtil.getFactorial(1));
       // 1! = 1
       Assert.assertEquals(2, MathUtil.getFactorial(2));
       Assert.assertEquals(6, MathUtil.getFactorial(3));
       Assert.assertEquals(24, MathUtil.getFactorial(4));
       Assert.assertEquals(120, MathUtil.getFactorial(5));
       Assert.assertEquals(120, MathUtil.getFactorial(6));       


       
       //hàm giúp so sánh 2 giá trị nào đó có giống nhau hay không
       //nếu giống nhau --> thấy màu xanh đèn đường - đường thông, code ngon
       // ít nhất cho case đang test
       // nếu không giống nhau -> tháy màu đỏ đèn đường 
       // hàm ý expected và actual không giống nhau
       
   }
   
   //hàm getF() ta thiết kế có 2 tình huống xử lí
   //1. đưa data tử tế [0..20] -> tính đc n!
   //2. đua data cà chớn, âm,>20: thiết kế của hàm là ném ra ngoại lệ
   //tao kì vọng ngoại lệ xuất hiện khi n < 0 || n > 20
   //rất mong ngoại lệ xuất hiện vói n cà chớn
   
   //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm nèm ra ngoại lệ
   //hàm chạy đúng như thiết kế -> xanh phải xuất hiện
   
   //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lê
   //sure, hàm chạy sai thiết kế, sai kì vọng, màu đỏ
   
   //test case:
   //input: - 5
   //expected: IllegalArgumentException xuất hiện
   //tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
   //assertEquals() ko dùng để so sánh 2 ngoại lệ
   //      equals() là bằng nhau hay không trên value
   
   //Màu đỏ, do hàm có nèm ngoại lệ thật sự 
   // nhưng không phải ngoại lệ như kì vọng
//   @Test(expected = NumberFormatException.class)
//   public void testGetFactorialGivenWrongArgumentThrowsException(){
//       MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
                                    //sẽ ném vào vào ngoại lệ NumberFormat
        
//   }
   
   
   @Test(expected = IllegalArgumentException.class)
   public void testGetFactorialGivenWrongArgumentThrowsException(){
       MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
                                    //sẽ ném vào vào ngoại lệ NumberFormat
        //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên
        //xài lambda
   }  
   //Test case: hàm sẽ ném vào ngoại lệ nếu nhận vào 21
   //tui cần thấy màu xanh khi chơi với 21!
   
   @Test
   public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
       // Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
       //       tham số 2: đoạn code chạy văng ra ngoại runnable);
       Assert.assertThrows(IllegalArgumentException.class,
               () -> MathUtil.getFactorial(-5)
               
       );
       //MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
   }
   
   //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
   //có ném, tức là chạy hàm đúng thiết kế -> xanh
    @Test
   public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
     
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try_catch là JUnit sẽ ra xanh do chủ động kiểm soát ngoại lệ 
            //nhưng không chắc ngoại lệ mình cần có xuất hiện hay ko???
            //có đoạn code kiểm soát đung sngoaij lệ IllegalArgumentException
            Assert.assertEquals("Invalid argument. N must be between 0..20",
                    e.getMessage());
        }
      
        //hàm @Test chạy, hay hàm getF() chạy
   }
}

