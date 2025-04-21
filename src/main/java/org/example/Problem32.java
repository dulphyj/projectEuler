package org.example;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Problem32 {

    public static void main(String[] args){
        int prod = 0;
        int mul = 1000;
        int control = 9999;
        ArrayList<Integer> res = new ArrayList<>();
        int resultado = 0;
        boolean cNum;

        for (int i = 1; i < 99; i ++ ){
            if( i > 9){
                mul = 100;
            }
            for (int j = mul; j < control; j++){
                prod = i * j;
                if (prod < control){
                    String num = Integer.toString(i) + Integer.toString(j) + Integer.toString(prod);
                    if (num.length() == 9){
                        /*if(num.contains("1") && num.contains("2") && num.contains("3") && num.contains("4") && num.contains("5") &&
                                num.contains("6") && num.contains("7") && num.contains("8") && num.contains("9") ){
                            if(!res.contains(prod)){
                                res.add(prod);
                            }
                        }*/
                        cNum = IntStream.rangeClosed(1,9)
                                .allMatch(n -> num.contains(String.valueOf(n)));
                        if (cNum){
                            if(!res.contains(prod)){
                                res.add(prod);
                            }
                        }
                    }
                }
            }
        }
        for (int r: res){
            resultado = resultado + r;
        }
        System.out.println(resultado);
    }
}
