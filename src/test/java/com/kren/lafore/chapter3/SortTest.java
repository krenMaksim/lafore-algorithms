package com.kren.lafore.chapter3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SortTest {

    private static final int[] array = { 7, 9, 8, 5, 6, 2 };

    private static final int[] sortedArray = array.clone();

    static {
	Arrays.sort(sortedArray);
    }

    @Test
    void bubbleSort() {
	assertArrayEquals(Sort.bubbleSort(array), sortedArray);
    }

    @Test
    void selectSort() {
	assertArrayEquals(Sort.selectSort(array), sortedArray);
    }
}
