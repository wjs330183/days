package Jvm;

public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    SuperClass(){
        System.out.println("456");
    }
    public static int value = 123;
}
