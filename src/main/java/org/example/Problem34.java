package org.example;

import java.util.stream.IntStream;

public class Problem34 {
    public static void main(String[] args){
        int res = 0;
        for(int i=100; i<1000000; i++){
            if(i<1000){
                int a = i / 100;
                int b = (i - (a * 100))/10;
                int c =  (i - (a * 100)) - (b*10);
                int r = factorial(a) + factorial(b) + factorial(c);
                if(r == i){
                    System.out.println(a + " " + b + " " + c + " factorial: " + r + " = " + i);
                    res = res + r;
                }
            }
            else if(i >= 1000 && i < 10000){
                int a = i / 1000;
                int b = (i - (a * 1000)) / 100;
                int c = (i - (a * 1000) - (b*100)) / 10;
                int d = (i - (a * 1000) - (b*100) - (c*10));
                int r = factorial(a) + factorial(b) + factorial(c) + factorial(d);
                if(r == i){
                    System.out.println(a + " " + b + " " + c + " " + d +" factorial: " + r + " = " + i);
                    res = res + r;
                }
            }
            if(i >= 10000 && i < 100000){
                int a = i / 10000;
                int b = (i - (a * 10000)) / 1000;
                int c = (i - (a * 10000) - (b*1000)) / 100;
                int d = (i - (a * 10000) - (b*1000) - (c*100)) / 10;
                int e = (i - (a * 10000) - (b*1000) - (c*100) - (d*10));
                int r = factorial(a) + factorial(b) + factorial(c) + factorial(d) + factorial(e);
                if(r == i){
                    System.out.println(a + " " + b + " " + c + " " + d + " " + e + " factorial: " + r + " = " + i);
                    res = res + r;
                }
            }
            if(i >= 100000 && i < 1000000){
                int a = i / 100000;
                int b = (i - (a * 100000)) / 10000;
                int c = (i - (a * 100000) - (b*10000)) / 1000;
                int d = (i - (a * 100000) - (b*10000) - (c*1000)) / 100;
                int e = (i - (a * 100000) - (b*10000) - (c*1000) - (d*100)) / 10;
                int f = (i - (a * 100000) - (b*10000) - (c*1000) - (d*100) - (e*10));
                int r = factorial(a) + factorial(b) + factorial(c) + factorial(d) + factorial(e) + factorial(f);
                if(r == i){
                    System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " factorial: " + r + " = " + i);
                    res = res + r;
                }
            }
        }
        System.out.println(res);
    }

    public static int factorial(int num){
        return IntStream.rangeClosed(1, num).reduce(1, (a,b) -> a*b);
    }
}
