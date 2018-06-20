package com.kren.lafore.chapter3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SortTest {

    private static final int[] array = { 2, 5, 8, 9, 6, 7 };

    private static final int[] sortedArray = array.clone();

    static {
	Arrays.sort(sortedArray);
    }

    @Test
    void bubbleSort() {
	assertArrayEquals(Sort.bubbleSort(array), sortedArray);
    }

}
