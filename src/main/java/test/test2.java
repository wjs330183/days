package test;

import java.util.Random;

public class test2 {
    private static Integer i = 42;
    private static Long l = 42l;
    private static Double d = 42.0;
    public static void main(String[] args) {
//        if (i.equals(d)) {
//            System.out.println(1);
//        }
//        if (d.equals(l)) {
//            System.out.println(2);
//        }
//        if (i.equals(l)) {
//            System.out.println(3);
//        }
//        if (l.equals(42L)) {
//            System.out.println(4);
//        }
//        test2 t = new test2();
//        int add = t.add(1, 2);
//        System.out.println(add);
        Random r = new Random();
        int[] a = new int[100];
        System.out.println(a.length);
        for (int j = 0; j < a.length - 1; j++) {
            a[j]=r.nextInt(230)+1;
        }

        fastsort(0, a.length - 1, a);
        for (int j = 0; j < a.length - 1; j++) {
            System.out.println("a[" + j + "]=" + a[j]);
        }

    }

    public static int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println(1231235678);
        }finally {
            System.out.println("nihao");
        }
        return 0;
    }

    public static int[] fastsort(int left, int right, int[] a) {
        if (left >= right) {
            return a;
        }
        int temp = a[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (a[j] >= temp && i < j) {
                j--;
            }
            while (a[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                int b = a[i];
                a[i] = a[j];
                a[j] = b;
            }
        }
        a[left] = a[i];
        a[i] = temp;
        fastsort(left, i-1, a);
        fastsort(i + 1, right, a);
        return a;
    }
}

