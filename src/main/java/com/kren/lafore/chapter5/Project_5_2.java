package com.kren.lafore.chapter5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Project_5_2 {
    private static final List<Integer> list = IntStream.of(5, 56, 4, 18, 6)
                                                       .mapToObj(Integer::valueOf)
                                                       .collect(Collectors.toList());

    public static void main(String[] arg) {
	Deque<Integer> deque = new LinkedList<>(list);

	showAll(deque);

	deque.addLast(999);

	showAll(deque);

	deque.addFirst(1000);

	showAll(deque);
    }

    private static void showAll(Deque<Integer> deque) {
	System.out.println();
	deque.forEach(i -> System.out.print(i + "  "));
	System.out.println();
    }
}
