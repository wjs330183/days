package test;

import java.util.concurrent.TimeUnit;

public class FibonacciSequence {
    public static void main(String[] args) {
        long n = 50;
        long begin = System.nanoTime();
        long f = calc(n);
//        long f = calcWithoutRecursion(n);
        long end = System.nanoTime();
        System.out.println("第" + n + "个斐波那契数是" + f + ", 耗时" + TimeUnit.NANOSECONDS.toMillis(end - begin) + "毫秒");

    }
    public static long calc(long n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0 || n == 1) {
            return n;
        } else {
            return calc(n - 1) + calc(n - 2);
        }
    }
    public static long calcWithoutRecursion(long n) {
        if(n < 0)
            return 0;
        if(n == 0 || n == 1) {
            return n;
        }
        long fib = 0;
        long fibOne = 1;
        long fibTwo = 1;
        for(long i = 2; i < n; i++) {
            fib = fibOne + fibTwo;
            fibTwo = fibOne;
            fibOne = fib;
        }
        return fib;
    }
}
