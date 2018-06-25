package com.kren.lafore.chapter4;

import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class QueueExecutor implements Runnable {

    private Queue<Integer> blockingQueue;

    public QueueExecutor(Queue<Integer> blockingQueue) {
	this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
	String threadName = Thread.currentThread()
	                          .getName();
	try {
	    Thread.sleep(500);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	int operations = 0;

	while (!blockingQueue.isEmpty()) {
	    blockingQueue.poll();
	    operations++;

	}

	System.out.println(threadName + ": " + operations);
    }

    // TEST CODE

    private static List<Integer> list = new Random().ints(10000000, 100, 1000)
                                                    .mapToObj(Integer::valueOf)
                                                    .collect(Collectors.toList());

    public static void main(String[] args) {

	Queue<Integer> blockingQueue = new ConcurrentLinkedQueue<>();
	blockingQueue.addAll(list);

	for (int i = 0; i < 100; i++) {
	    new Thread(new QueueExecutor(blockingQueue)).start();
	}

	System.out.println(blockingQueue.isEmpty());
    }

}
