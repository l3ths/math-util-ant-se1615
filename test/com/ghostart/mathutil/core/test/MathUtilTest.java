/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ghostart.mathutil.core.test;

import com.ghostart.mathutil.core.MathUtil;
import com.ghostart.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author thanhhuy
 */
public class MathUtilTest {
    
    //@Test la 1 danh dau - annotation de bao voiJVM
    //biet rang ham nay la ham main() va chay code trong ham nay
    //neu thieu @Test truoc ham, thi JUnit khong van hanh
    
   @Test
   //test case 1: n = 0, expected  = 1 
   //test case 2: n = 1, expected  = 1 
   //test case 3: n = 2, expected  = 2 
   //test case 4: n = 3, expected  = 6 
   public void testFactorialGivenRightArgumentReturnsWell(){
       long expected = 1;
       long actual = MathUtil.getFactorial(0);
       Assert.assertEquals(expected, actual);
       Assert.assertEquals(1, MathUtil.getFactorial(1));
       Assert.assertEquals(2, MathUtil.getFactorial(2));
       Assert.assertEquals(6, MathUtil.getFactorial(3));
   }
   @Test
   //test case 4: n = 4, expected  = 24 
   //test case 5: n = 5, expected  = 120 
   public void testFactorialGivenRightArgumentReturnsWell2(){
       Assert.assertEquals(24, MathUtil.getFactorial(4));
       Assert.assertEquals(120, MathUtil.getFactorial(5));
   }
   //bat exception thi sao
   @Test (expected = IllegalArgumentException.class)
   //test case 6: n = -5, expected : hi vong thay ngoai le duoc nem ra
   //neu -5 dua vao ham, thi phai thay ngoai le xuat hien
   //neu ngoai le xuat hien khi tinh -5!, NGHIA LA HAM CHAY DUNG NHU THIET KE
   //TUI MUON DO, CO NGOAI LE XUAT HIEN HAY KO KHI CHOI -5
   //DO NGOAI LE K LA VALUE DE SO SANH
   //CACH VIET KHAC 1 TI: KHI CHAY -5!, EXPECTED = IllegalArgumentException.class
   //nghia la co su xuat hien cua 1 object thuoc class IllegalArgumentException
   //ko bat Exception vi chung chung 
   public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
   }
    
//    @Test
//    public void testGreen(){
//        Assert.assertEquals(10, 10);
//    }
//    
//    @Test
//    public void testRed(){
//        Assert.assertEquals(10, 100);//em hi vong tra ve 10 => thuc te k la 10 -> do
//    }
    
}
