package org.example;

import java.util.ArrayList;

public class Problem33 {
    public static void main(String[] args){
        int numerdaor = 1;
        int denominador = 1;

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if(i != j){
                    if(i % j != 0){
                        float r = (float)(i)/(float) (j);
                        for (int x = 1; x < 10; x++){
                            int numA = (i * 10) + x;
                            int denA = (j * 10) + x;
                            int numB = (x * 10) + i;
                            int denB = (x * 10) + j;
                            float raa = (float)(numA)/(float) (denA);
                            float rab = (float)(numA)/(float) (denB);
                            float rba = (float)(numB)/(float) (denA);
                            float rbb = (float)(numB)/(float) (denB);
                            if( raa == r && raa < 1){
                                numerdaor = numerdaor * numA;
                                denominador = denominador * denA;
                            } else if( rab == r && rab < 1){
                                numerdaor = numerdaor * numA;
                                denominador = denominador * denB;
                            } else if( rba == r && rba < 1){
                                numerdaor = numerdaor * numB;
                                denominador = denominador * denA;
                            } else if( rbb == r && rbb < 1){
                                numerdaor = numerdaor * numB;
                                denominador = denominador * denB;
                            }
                        }
                    }
                }

            }
        }
        System.out.println(numerdaor + "/" + denominador);

    }
}
