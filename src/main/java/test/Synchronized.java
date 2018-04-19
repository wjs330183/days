package test;

public class Synchronized {
    Object object1 = new Object();
    public void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            //在这里执行一个死循环
            while (isContinueRun) {

            }
            System.out.println("methodA end");
        }
    }

    Object object2 = new Object();

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}

class Single0{
    private Single0 single0 = new Single0();
    public Single0(){}

    public Single0 getSingle0(Single0 single0) {
        return single0;
    }
}

class Single01 {
    private Single01 single01 = null;
    public Single01() {

    }

    public Single01 getSingle01(Single01 single01) {
        if (single01 == null) {
            new Single01();
        }
        return single01;
    }
}