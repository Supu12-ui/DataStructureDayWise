package com.company.cp;

import java.util.Scanner;

public class Next_round {

    public void search(int a[], int k) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        int li = 0;
        int target = a[k];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == target && a[mid] != 0) {
                li = mid;
                start = mid + 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (li != 0) {
            System.out.print(li + 1);
        } else {
            System.out.println(li);
        }
    }
}
