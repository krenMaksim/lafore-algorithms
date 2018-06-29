package com.kren.lafore.chapter5.project5_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CyclicLinkedListTest {
    private static final List<Integer> list = IntStream.of(5, 56, 4, 18, 6)
                                                       .mapToObj(Integer::valueOf)
                                                       .collect(Collectors.toList());

    private CyclicLinkedList<Integer> cyclicLinkedList;

    @BeforeEach
    void init() {
	cyclicLinkedList = new CyclicLinkedList<>(list);
    }

    @Test
    void findLittleListSize() {
	assertEquals(Integer.valueOf(5), cyclicLinkedList.find(1));
    }

    @Test
    void findMoreListSize() {
	assertEquals(Integer.valueOf(5), cyclicLinkedList.find(6));
    }

    @Test
    void findIntegerPartOfListSize() {
	assertEquals(Integer.valueOf(6), cyclicLinkedList.find(list.size() * 2));
    }

    @Test
    void findNegativeNumber() {
	assertEquals(Integer.valueOf(18), cyclicLinkedList.find(-2));
    }

    @Test
    void findNegativeNumberMoreListSize() {
	assertEquals(Integer.valueOf(6), cyclicLinkedList.find(-6));
    }

    @Test
    void findNegativeNumberIntegerPartOfListSize() {
	assertEquals(Integer.valueOf(5), cyclicLinkedList.find(-list.size() * 2));
    }

    @Test
    void insert() {
	int val = 100;
	int position = 1;

	cyclicLinkedList.insert(position, val);

	assertEquals(Integer.valueOf(val), cyclicLinkedList.find(position));

    }

    @Test
    void delete() {
	int position = 1;

	cyclicLinkedList.delete(position);

	assertEquals(Integer.valueOf(56), cyclicLinkedList.find(position));
    }
}
