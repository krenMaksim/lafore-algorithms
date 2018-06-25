package com.kren.lafore.chapter4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class QueueExecutorTest {

    private static List<Integer> list = new Random().ints(100, 100, 1000)
                                                    .mapToObj(Integer::valueOf)
                                                    .collect(Collectors.toList());

    @Test
    void simpleQueue() {

	System.out.println("simpleQueue()");

	Queue<Integer> queue = new LinkedList<>();
	queue.addAll(list);

	while (!queue.isEmpty()) {
	    System.out.println(queue.poll());

	}

    }

    @Test
    void queueExecutor() {
	System.out.println("queueExecutor()");

	Queue<Integer> concurrentQueue = new ConcurrentLinkedQueue<>();
	concurrentQueue.addAll(list);

	for (int i = 0; i < 10; i++) {
	    new Thread(new QueueExecutor(concurrentQueue)).start();

	}
    }

}
