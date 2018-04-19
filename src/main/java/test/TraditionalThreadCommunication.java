package test;

public class TraditionalThreadCommunication {
    public static void main(String[] args) {
        final Business business = new Business();
        for (int j = 0; j < 50; j++) {
            for (int i = 0; i < 10; i++) {
                business.run();
                System.out.println(i);
            }
            for (int i = 0; i < 100; i++) {
                System.out.print("fa_run");
                System.out.println(i);
            }
        }
    }

}

class Business implements Runnable {

    public void run() {
        System.out.print("sun_run");
    }
}
