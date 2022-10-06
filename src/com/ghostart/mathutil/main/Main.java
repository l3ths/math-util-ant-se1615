/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ghostart.mathutil.main;

import com.ghostart.mathutil.core.MathUtil;

/**
 *
 * @author thanhhuy
 */
public class Main {
    public static void main(String[] args) {
        //1 DUNG MAT LUAN KQ
        //Goi ham voi gia tri dau vao chuan bi thang o test case
        //in ra kq, dung mat luan dung sai giua EXPECTED vs ACTUAL
        //in kq xu li ham theo
        //- sout
        //- log file
        //- pop up

        //MANUAL TEST dung sout => unit testing
        //Test Case 1: n = 0, expected == getFectorial(0) == 1
        long expectedValue = 1;
        long actualValue =MathUtil.getFactorial(0);
        System.out.println("Test 0! : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 2: n = 1, expected == getFectorial(0) == 1
        expectedValue = 2;
        actualValue =MathUtil.getFactorial(1);
        System.out.println("Test 1! : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 3: n = 2, expected == getFectorial(0) == 2
        expectedValue = 2;
        actualValue =MathUtil.getFactorial(2);
        System.out.println("Test 2! : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 4: n = 3, expected == getFectorial(0) == 6
        expectedValue = 6;
        actualValue =MathUtil.getFactorial(3);
        System.out.println("Test 3! : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 5: n = 4, expected == getFectorial(0) == 24
        expectedValue = 24;
        actualValue =MathUtil.getFactorial(4);
        System.out.println("Test 4! : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 6: n = -5, hi vong bi chui
        System.out.println("Test -5! : See illegal argument exception");
        actualValue =MathUtil.getFactorial(-5);
        //VIEC KET LUAN HAM DUNG HAY SAI THI MAT TA PHAI DUYET QUA TUNG CAP EXPECTED == ACTUAL HAY KHONG??
        //VA DUYET HET THI MOI RA KET LUAN. HOI MAT SUC, DE SAI SOT
        //NEU MAY LAM DUM LUON PHAN NAY => TEST AUTOMATION
        // MAY QUET QUA HET CAC CAP VA CHOT 1 CAU
        // DUNG , SAI
        //NHO TRO NAY => TU DONG HOA DC VIEC KIEM SOAT CHAT LUONG CODE
        //THANG DEV NAO SUA CODE, ONG CHI QUET 1 LUOT -> KET LUAN LUON
        //LOI CI - CONTINUOUS INTERGRATION - TICH HOP LIEN TUC
        
    }

}
//de test 1 ham hay 1 method hay 1 class co nhieu ca cu the sau:
//1 TEST DUNG MAT DE LUAN KET QUA DUNG SAI - MANUAL TEST - TRAU BO DUNG SUC
//2 DUNG MAT XEM HAI MA MAU XANH DO LA DU 
//- XANH HAM DUNG - DO HAM SAI (SO SANH EXPECTED VOI ACTUAL)
//- TEST AUTOMATION; KI THUAT HIEN DAI HON, DO DUNG SUC DE LUAN KET QUA - DOI HOI TU DUY CODE NHIEU HON


