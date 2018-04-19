package ThreadTest;

public class Bank {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        protected Integer initialValue() {
            return 100;
        }
    };

    public static void save(int money) {
        threadLocal.set(threadLocal.get() + money);
    }
    public static int getThread() {
        return threadLocal.get();
    }

    public static void main(String[] args) {
        save(100);
        System.out.println();
        new Thread(() -> System.out.println("lambda")).start();

    }
}
