package org.example;

import java.util.Arrays;

/*
* A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
* If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
* The lexicographic permutations of 0, 1 and 2 are:
* 012   021   102   120   201   210
* What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?*/
public class Problem24 {
    public static void main(String[] args) {
        int[] elemets = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        generatePermutation(elemets);
    }

    public static void generatePermutation(int[] elements) {
        Arrays.sort(elements);
        boolean permutationTrue = true;
        int permutationNumber = 1000000;
        int cont = 0;
        while (permutationTrue) {
            cont ++;
            if (cont == permutationNumber){
                showArray(elements);
            }
            int i = elements.length - 2;
            while (i >= 0 && elements[i] >= elements[i + 1]) {
                i--;
            }

            if (i < 0) {
                permutationTrue = false;
            } else {
                int j = elements.length - 1;
                while (elements[j] <= elements[i]) {
                    j--;
                }
                exchange(elements, i, j);
                invert(elements, i + 1, elements.length - 1);
            }
        }
    }

    public static void exchange(int[] elements, int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    public static void invert(int[] elements, int first, int last) {
        while (first < last) {
            exchange(elements, first, last);
            first++;
            last--;
        }
    }

    public static void showArray(int[] elements) {
        for (int element : elements) {
            System.out.print(element);
        }
        System.out.println();
    }
}
