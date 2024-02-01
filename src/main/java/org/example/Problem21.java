package org.example;
/*
 Let d(n) be defined as the sum of proper divisors of n(numbers less than n which divide evenly into n).
 If d(a)=b and d(b)=a, where a!=b, then "a" and "b" are an amicable pair and each of "a" and "b" are called amicable numbers.
 For example, the proper divisors of 220 are 1,2,4,5,10,11,20,22,44,55 and 110; therefore d(220)=284.
 The proper divisors of 284 are 1,2,4,71 and 142; so d(284)=220.
 Evaluate the sum of all the amicable numbers under 10000.
*/
public class Problem21 {
    public static void main(String[] args) {
        int limit = 10000;
        int[] divisorsSum = new int[limit];

        for (int i = 1; i < limit; i++) {
            divisorsSum[i] = sumOfDivisors(i);
        }

        int result = 0;
        for (int j = 2; j < limit; j++) {
            int b = divisorsSum[j];

            if (b < limit && j != b && divisorsSum[b] == j) {
                result += j;
            }
        }
        System.out.println(result);
    }

    public static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}
