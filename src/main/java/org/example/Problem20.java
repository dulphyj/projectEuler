package org.example;

import java.math.BigInteger;

/*
 n! means n*(n-1)*...*3*2*1
 For example. 10! = 10*9*...*2*1 = 3628800
 and the sum of the digits in the number 10! is 3+6+2+8+8+0+0=27
 Find the sum of the digits in the number 100!
*/
public class Problem20 {

    public static void main(String[] args){
        System.out.println(sumDigits(factorial(100)));
    }

    static int sumDigits(BigInteger num){
        String numStr = num.toString();
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++){
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    static BigInteger factorial(int num){
        BigInteger fac = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++){
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
}
