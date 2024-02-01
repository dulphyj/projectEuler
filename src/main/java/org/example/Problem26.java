package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
* A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with
  denominators 2 to 10 are given:
  1/2=0,5
  1/3=0,(3)
  1/4=0,25
  1/5=0,2
  1/6=0,1(6)
  1/7=0,(142857)
  1/8=0,125
  1/9=0,(1)
  1/10=0,1
  Where 0,(6) means 0,1666666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
  Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.*/
public class Problem26 {
    public static void main(String[] args){
        int limit = 1000;
        int decimal = 10000;
        int con;
        int d = 0;
        List<Character> fragmentedNum;
        for(int i = 2; i < limit; i++){
            BigDecimal res = BigDecimal.ONE;
            res = res.divide(BigDecimal.valueOf(i), decimal, RoundingMode.HALF_UP);
            String num = res.toString();
            fragmentedNum = numInList(num);
            con = periodNumber(fragmentedNum, decimal);
            if (con > d){
                d = i;
            }

        }
        System.out.println(d);
    }

    static List<Character> numInList(String num){
        List<Character>number = new ArrayList<>();
        for(int i = 2; i<num.length(); i++) {
            char c = num.charAt(i);
            number.add(c);
        }
        return number;
    }
    static int periodNumber(List<Character> num, int limit){
        int count;
        int space = 0;
        boolean periodicN = false;
        while (!periodicN){
            space++;
            count = 0;
            for(int i = 0; i< limit; i++){
                if(i+space < num.size()){
                    if(Objects.equals(num.get(i), num.get(i+space))){
                        count++;
                    } else {
                        count = 0;
                    }
                } else {
                    break;
                }
                if (count > 6){
                    periodicN = true;
                    break;
                }
            }
        }
        return space;
    }

}

