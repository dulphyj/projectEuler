package org.example;
 /*
 Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 1634=1⁴+6⁴+3⁴+4⁴
 8208=8⁴+2⁴+0⁴+8⁴
 9474=9⁴+4⁴+7⁴+4⁴
 As 1=1⁴ is not a sum it is not included.
 The sum of these numbers is 1634+8208+9474=19316
 Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Problem30 {

 public static void main(String[] args){
    int limit = 1000000;
    int sumExp = 0;
    int exp = 5;
    for(int i = 4150; i < limit; i++){
      int sum = 0;
      String num = String.valueOf(i);
      for (int j = 0; j < num.length(); j++){
         int val = Character.getNumericValue(num.charAt(j));
         int res =(int) Math.pow(val, exp);
         sum += res;
         if(sum > i){
          break;
         }
        }
        if(sum == i){
          sumExp += i;
       }
    }
    System.out.println(sumExp);
 }
}
