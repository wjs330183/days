package test;

public class test3 {
    public static void main(String[] args) {
        A a = new A();
        A aa = new A(1);
        a = aa;
    }
}

class A {
    int i;

    public A() {
    }

    public A(int i) {
        this.i = i;
    }
}

class AA {

}