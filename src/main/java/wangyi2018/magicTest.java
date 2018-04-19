package wangyi2018;

import java.util.Scanner;

public class magicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = 0;
        if (scan.hasNext()) {
            String str = scan.next();
            in = Integer.valueOf(str).intValue();
        }
        String s = getmagic(in, "");
        System.out.println(order(s));
    }





    public static String getmagic(int a, String str) {
        if (a == 0) {
            return str;
        }
        if ((a - 2) % 2 == 0) {
            int i = (a - 2) / 2;
            str = str + 2;
            return getmagic(i, str);
        } else if ((a - 1) % 2 == 0) {
            int i = (a - 1) / 2;
            str = str + 1;
            return getmagic(i, str);
        } else {
            return str;
        }
    }

    public static String order(String str) {
        String s = "";
        int lenth = str.length()-1;
        for (int i = lenth; i >= 0; i--) {
            s = s + String.valueOf(str.charAt(i));
        }
        return s;
    }
}
