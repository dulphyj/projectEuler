package org.example;
/*
 Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 By starting with 1 and 2, the first 10 terms will be: 1,2,3,5,8,13,21,34,55,89...
 By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the
 even-valued terms.
*/
public class Problem02 {
    public static void main(String[] args){
        long limit = 4000000;
        int f = 1;
        int bf = 0;
        int sum = 0;
        for(int i = 1; i <= limit; i++){
            f = bf + f;
            bf = f - bf;
            if (f <= limit){
                if(f%2==0){
                    sum += f;
                }
            } else
                break;
        }
        System.out.println(sum);
    }
}
