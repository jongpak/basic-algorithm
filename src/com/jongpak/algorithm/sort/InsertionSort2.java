package com.jongpak.algorithm.sort;

import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        int v[] = { 5, 0, -5, 89, 0, 56, 9, -4, 5, 67, 89 };

        System.out.println(Arrays.toString(v));

        insertionSort(v);

        System.out.println(Arrays.toString(v));
    }

    public static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int tmp = v[i];
            int j = i - 1;

            while (0 <= j && tmp < v[j]) {
                printProceeding(v, i, j);

                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = tmp;

            System.out.println("----------------------------------------");
        }
    }

    public static void swap(int[] v, int i, int j) {
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }

    public static void printProceeding(int[] v, int a, int b) {
        System.out.print("  [");

        for (int i = 0; i < v.length; i++) {
            if (i == a) {
                System.out.print("<");
            }
            if (i == b) {
                System.out.print("(");
            }

            System.out.print(v[i]);

            if (i == b) {
                System.out.print(")");
            }
            if (i == a) {
                System.out.print(">");
            }

            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
        System.out.println();
    }
}
