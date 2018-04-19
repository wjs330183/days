package wangyi2018;

import java.util.Scanner;

public class addorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        if (scan.hasNext()) {
            str = scan.next();
        }
        String s = order(judge(str));

        System.out.println(add(s,str).toString());

    }

    public static String add(String s, String S) {
        int i = Integer.valueOf(s).intValue();
        int j = Integer.valueOf(S).intValue();
        int temp = i + j;
        String str = String.valueOf(temp);
        return str;
    }

    public static String order(String s) {
        String str = "";
        int lenth = s.length() - 1;
        for (int i = lenth; i >= 0; i--) {
            str = str + s.charAt(i);
        }
        return str;
    }

    public static String judge(String s) {
        String str = s;
        if ('0' == s.charAt(0)) {
            str = s.substring(1, s.length());
            return judge(str);
        } else {
            return str;
        }
    }
}
