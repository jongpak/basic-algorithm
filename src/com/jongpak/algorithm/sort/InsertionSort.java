package com.jongpak.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int v[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(v));

        insertionSort(v);

        System.out.println(Arrays.toString(v));
    }

    public static void insertionSort(int[] v) {
        for(int i = 1; i < v.length; i++) {
            if(v[i - 1] < v[i]) {
                continue;
            }

            for(int j = i; j > 0; j--) {
                if(v[j - 1] < v[j]) {
                    break;
                }

                printProceeding(v, j - 1, j);

                swap(v, j - 1, j);
            }
            System.out.println("  -----------------------------------");
        }
    }

    public static void swap(int[] v, int i, int j) {
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }

    public static void printProceeding(int[] v, int a, int b) {
        System.out.print("  [");

        for(int i = 0; i < v.length; i++) {
            if(i == a) {
                System.out.print("<");
            }
            if(i == b) {
                System.out.print("(");
            }

            System.out.print(v[i]);

            if(i == b) {
                System.out.print(")");
            }
            if(i == a) {
                System.out.print(">");
            }

            if(i < v.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
        System.out.println();
    }
}
