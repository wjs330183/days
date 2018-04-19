package test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Block {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new LinkedBlockingQueue(10);
        blockingQueue.put(1);
        blockingQueue.take();
        int i = System.identityHashCode(Sort.class);
        System.out.println(i);

    }
}