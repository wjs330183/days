package ThreadTest;

import sun.awt.windows.ThemeReader;

public class LambdaTest {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("In Java 8,lambda expression rocks !!")).start();
        new Thread(()-> System.out.println("second")).start();
    }
}
