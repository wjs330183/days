package wangyi2018;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Stringselect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        if (scan.hasNext()) {
            str = scan.next();
        }
        System.out.println(getavr(str));

    }

    public static String getavr(String s) {
        double count = 1.00;
        double lenth = Double.valueOf(s.length() - 1).doubleValue();
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < lenth; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return df.format(s.length() / count);
    }
}
