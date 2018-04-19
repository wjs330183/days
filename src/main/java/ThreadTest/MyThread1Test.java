package ThreadTest;



public class MyThread1Test {

        public static void main(String[] args){
            /**
             * 第一种
             */
//            MyThread1 myThread = new MyThread1();
//            myThread.setName("A");
//            myThread.start();

            /**
             * 第二种
             */
            MyThread1 myThread = new MyThread1();
            // 将线程对象以构造参数的方式传递给Thread对象进行start（）启动线程
            Thread newThread = new Thread(myThread);
            newThread.setName("A");
            newThread.start();
        }
    }
