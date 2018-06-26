package com.kren.lafore.chapter5;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Project_5_1 {
    private static final List<Integer> list = IntStream.of(5, 56, 4, 18, 6)
                                                       .mapToObj(Integer::valueOf)
                                                       .collect(Collectors.toList());

    public static void main(String[] arg) {
	Queue<Integer> priorityQueue = new PriorityQueue<>(list);

	priorityQueue.forEach(i -> System.out.println(i));
    }
}
