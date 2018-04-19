package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hashtest {
    public static void main(String[] args) {
        String s = new String("http://www.mysql.com");
        System.out.println(s.hashCode());
////        Map<String, String> after, brfore;
//        int[] a = new int[100];
//        Random r = new Random();
//        for (int i = 0; i < a.length - 1; i++) {
//            a[i] = r.nextInt(200) + 1;
//        }
//        fastsort(0, a.length - 1, a);
//        for (int i = 0; i < a.length - 1; i++) {
//            System.out.println("a[" + i + "]=" + a[i]);
//        }
        String path = System.getProperty("java.class.path");//("sun.boot.class.path");
        String[] paths = path.split(";");
        for (int i = 0; i < paths.length - 1; i++) {
            System.out.println(paths[i]);
        }
//        System.out.println(System.getProperty("java.class.path"));
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
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = temp;
        fastsort(left, i - 1, a);
        fastsort(i + 1, right, a);
        return a;
    }
}
