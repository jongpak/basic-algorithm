package com.jongpak.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int v[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println(Arrays.toString(v));

        quickSort(v);

        System.out.println(Arrays.toString(v));
    }

    public static void quickSort(int[] v) {
        partition(v, 0, v.length - 1);
    }

    public static void partition(int[] v, int start, int end) {
        int mid = (start + end) / 2;

        int left = start;
        int right = end;
        int pivot = v[mid];

        printProceeding(v, start, mid, end);

        while (left <= right) {
            while (v[left] < pivot) {
                left++;
            }

            while (v[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(v, left, right);
                left++;
                right--;
            }
        }

        if (start < right) {
            partition(v, start, right);
        }
        if (left < end) {
            partition(v, left, end);
        }
    }

    public static void swap(int[] v, int i, int j) {
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }

    public static void printProceeding(int[] v, int a, int b, int c) {
        System.out.print("  ");

        for (int i = 0; i < v.length; i++) {
            if (i == a) {
                System.out.print("[");
            }

            if (i == b) {
                System.out.print("<");
            }

            System.out.print(" " + v[i] + " ");

            if (i == b) {
                System.out.print(">");
            }

            if (i == c) {
                System.out.print("]");
            }
        }
        System.out.println();
    }
}
