package org.example;
/*
 The sum of the primes below 10 is: 2+3+5+7=17
 Find the sum of all the primes below two million.
*/
public class Problem10 {
    public static void main(String[] args){
        long limit = 2000000;
        long sum=0;
        for (int i = 2; i < limit ; i++){
            if(isPrime(i)){
                //System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.print(sum);

    }

    static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
