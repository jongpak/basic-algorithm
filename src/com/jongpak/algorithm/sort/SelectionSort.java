package com.jongpak.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int v[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(v));

        selectionSort(v);

        System.out.println(Arrays.toString(v));
    }

    public static void selectionSort(int[] v) {
        for(int i = 0; i < v.length; i++) {
            for(int j = i + 1; j < v.length; j++) {
                printProceeding(v, i, j);

                if(v[i] > v[j]) {
                    swap(v, i, j);
                }
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