package ThreadTest;

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating" + threadName);
    }


    public void run() {
        System.out.println("Running" + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread:" + threadName);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread" + threadName + "exiting.");
        }
    }

    public void start() {
        System.out.println("Starting" + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

