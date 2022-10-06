/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ghostart.mathutil.core;

/**
 *
 * @author thanhhuy
 */
public class MathUtil {
    //ham tinh n!
    //0!=1!=1 quy uoc
    //vi giai thua tang rat nhanh, 21! tran kieu long(18 so 0)
    //quy uoc nhan vao tu 0-20  
    public static long getFactorial(int n){
        
        if (n<0||n>20) 
            throw new IllegalArgumentException("invalid argument. n must be between 0..20");
        
        if (n==0|| n==1) 
            return 1;
        
        long product=1;//tich khoi dau la 1
        for (int i = 1; i <= n; i++) 
            product*=i;
        
        return product;
    }
    //tu duy viet code theo kieu TDD-Test driven development
    //Test First Development: khi viet code thi song song do phai 
    //viet cac tinh huong kiem thu code/ham/class/kiem thu app
    
    //Tu duy viet code kem kiem thu:
    //ham cua ta getFactorial(n dua vao) -> tra ve n! trong gioi han long
    //ta suy nghi luon tinh huong kiem thu - test case
    //TDD la vua code vua suy nghi test case
    //case kiem thu code
    
    //Case 1: n = 0, expected == getFectorial(0) == 1
    //Case 2: n = 1, expected == getFectorial(0) == 1
    //Case 3: n = 2, expected == getFectorial(0) == 2
    //Case 4: n = 3, expected == getFectorial(0) == 6
    //Case 5: n = 4, expected == getFectorial(0) == 24
    //Case ...: n = 21, expected == getFectorial(21) == Ngoại lệ vì n! quá lớn, k lưu trong long được
    //Case ...: n < 0, expected == getFactorial(-5) == ngoại lệ vì k tính giai thừa âm

}
