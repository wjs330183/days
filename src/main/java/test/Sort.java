package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Sort {
    public static void main(String[] args) {
        int[] a = new int[10240];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*15000)+1;
//            System.out.printf(a[i]+",");
        }
        long begin = System.nanoTime();

        int[] b = fastSort(0, a.length-1, a);
//         int[] b = bubbleSort(a);
//        for (int i = 0; i < b.length; i++) {
//            System.out.printf(b[i]+",");
//        }
        System.out.println();
        long end = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(end-begin));
        List list = new ArrayList();
        list.stream();

    }

    public static int[] fastSort(int left, int right, int[] a) {
        if (left >= right) {
             return a;
        }
        int temp = a[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (temp <= a[j] && i < j) {
                j--;//从右往左找找小的
            }
            while (temp >= a[i] && i < j) {
                i++;//从左往右找找大的
            }
            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = temp;
        fastSort(left, i - 1, a);
        fastSort(i + 1, right, a);
        return a;
    }

    public static int[] bubbleSort(int[] a ) {
        int n = a.length-1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
