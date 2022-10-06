/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.ghostart.mathutil.core.test;

import static com.ghostart.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import static .... ten-class.tenham; thi sau nay khi goi ham static bo luon class, dung nhu C
//.* la dai dien tat cxa ca ham trong class
/**
 *
 * @author thanhhuy
 */

//ki thuat ddt - data driven testing
//DDT: ki thuat to chac cac test case cho gon gang
//tach cac cau lenh kiem thu va bo data dung de test rieng ra 2 noi
//ban vua hoc dang tron data test va goi ham
//lan lon voi nhau, k ro rang, ko sai
//neu ta muon check ham getF voi cac gia tri dau vao ma co tra ra cac dau ra mong doi hay khong, kieu nhu: 
// 0 -> 1
// 1 -> 1
// 2 -> 2
// 3 -> 6
// 4 -> 24
// 5 -> 120
// 6 -> 720
// ....
//lat hoi ta nhoi dam data nay vao ham assertEquals (? getF(?))
//cam giac viet cop de test ham nhin ro rang hon
//cho goi ham, ki thuat nay goi la DDT - viet test case theo kieu 
//huong ve tach data cho de doc, con goi la PARAMETERIZED TESTING 
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //Chuan bi data de nhoi vao test
    // quy uoc ham cbi data phai la static
    @Parameterized.Parameters
    public static Object[][] initData(){
        
        return new Integer[][]{
            {0,1},{1,1},{2,2},{3,6},{4,24},{5,120},{6,720}
        };
    }
    @Parameterized.Parameter(value = 0) //map bien nay vao cot 0
    public int n;
    @Parameterized.Parameter(value = 1) //map voi cot 1
    public long expected;
    //2 bien nay se map vao 2 cot tuong ung cua ham init datda
    //sau do ta nhoi 2 bien vao trong ham assertEquals() nhu cu
    @Test //xai data tu 2 bien tren     
    public void testFactorialGivenRightArgumentReturnsWell(){
      
       assertEquals(expected, getFactorial(n));
   }
}
// ket luan chung xanh do: xanh khi tat ca deu xanh
// do chi can 1 do tat ca do
//ham da dung thi phai dung het voi cac cases
// tich hop lien tuc - continuous iteration