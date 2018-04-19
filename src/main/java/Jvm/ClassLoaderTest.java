package Jvm;

import org.junit.Test;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader c1 = Test.class.getClassLoader();
        System.out.println("ClassLoader is" + c1.toString());
        System.out.println("ClassLoader's father is" + c1.getParent().toString());
        System.out.println("ClassLoader's grandfather is" + c1.getParent().getParent().toString());
//        c1 = int.class.getClassLoader();
//        System.out.println("ClassLoader is"+c1.toString());
    }
}
