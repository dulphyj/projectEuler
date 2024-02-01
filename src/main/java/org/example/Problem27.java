package org.example;

import java.math.BigInteger;

/*
*Euler discovered the remarkable quadratic formula:
 n² + n + 41
 It turns out that the formula will produce 40 primes for the consecutive integer values 0 <= n <= 39.
 However, when n = 40, 40² + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is
 clearly divisible by 41.
 The incredible formula n² - 79n + 1601 was discovered, which produces 80 primes for the consecutive values 0 <= n <= 79.
 The product of the coefficients, -79 and 1601, is -126479.
 Considering quadratics of the form:
 n² + an + b, where |a| < 1000 and |b| <= 1000
 where |n| is the modulus/absolute value of n
 e.g. |11| = 11 and |-4| = 4
 Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes
 for consecutive values of n, starting with n = 0.
* */
public class Problem27 {
    public static void main(String[] args){
       int a = -999;
       int b = -1000;
       int limit = 1000;
       int max = 0;
       int product=0;
       for (int i = a; i < limit; i++){
           for (int j = b; j <= limit; j++){
               if(formula (i,j) > max){
                   max = formula (i,j);
                   product = i * j;
               }
           }
       }
        System.out.println(product);
    }

    static int formula(int a, int b){
        int limit = 1000;
        int n;
        int cont = 0;
        for (int i = 0; i <= limit; i++){
            n = (i*i) + (i*a) + b;
            if(n > 0){
                if(prime(n)){
                    cont++;
                } else {
                    return cont;
                }
            } else {
                break;
            }
        }
        return cont;
    }

    static boolean prime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
