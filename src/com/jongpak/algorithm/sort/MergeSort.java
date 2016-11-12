package com.jongpak.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int v[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(v));

        mergeSort(v);

        System.out.println(Arrays.toString(v));
    }

    public static void mergeSort(int[] v) {
        int[] w = new int[v.length];

        divide(v, 0, v.length - 1, w);
    }

    public static void divide(int[] v, int start, int end, int[] w) {
        int mid = (start + end) / 2;

        if(start < end) {
            divide(v, start, mid, w);
            divide(v, mid + 1, end, w);
            merge(v, start, end + 1, w);
        }
    }

    public static void merge(int[] v, int start, int end, int[] w) {
        int mid = (start + end - 1) / 2;

        int i = start;
        int j = mid + 1;
        int k = start;

        while(i <= mid && j < end) {
            if(v[i] < v[j]) {
                w[k] = v[i];
                i++;
            } else {
                w[k] = v[j];
                j++;
            }
            k++;
        }

        printProceeding(v, start, end);

        if(i > mid) {
            System.arraycopy(v, j, w, k, end - j);
        } else {
            System.arraycopy(v, i , w, k, mid - i + 1);
        }
        System.arraycopy(w, start, v, start, end - start);

        printProceeding(v, start, end);
        System.out.println("  ----------------------------------");
    }

    public static void swap(int[] v, int i, int j) {
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }

    public static void printProceeding(int[] v, int a, int b) {
        System.out.print("  ");

        for(int i = 0; i < v.length; i++) {
            if(i == a) {
                System.out.print("[");
            }

            System.out.print(" " + v[i] + " ");

            if(i == b - 1) {
                System.out.print("]");
            }
        }
        System.out.println();
    }
}
