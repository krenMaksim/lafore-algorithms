package com.kren.lafore.chapter3;

public class Sort {

    private Sort() {
	throw new AssertionError();
    }

    public static int[] bubbleSort(int[] array) {

	int[] sortedArray = array.clone();
	int lastIndex = sortedArray.length - 1;

	for (int i = lastIndex; i >= 0; i--) {
	    for (int j = 0; j < i; j++) {
		int current = sortedArray[j];
		int next = sortedArray[j + 1];

		if (current > next) {
		    switchElements(sortedArray, j, j + 1);
		}
	    }
	}

	return sortedArray;
    }

    public static int[] selectSort(int[] array) {

	int[] sortedArray = array.clone();

	for (int i = 0; i < sortedArray.length; i++) {
	    int minIndex = i;

	    for (int j = i; j < sortedArray.length; j++) {
		if (sortedArray[minIndex] > sortedArray[j]) {
		    minIndex = j;
		}
	    }

	    if (minIndex != i) {
		switchElements(sortedArray, minIndex, i);
	    }

	}

	return sortedArray;
    }

    private static void switchElements(int[] array, int firstIndex, int secondIndex) {
	int firstValue = array[firstIndex];
	array[firstIndex] = array[secondIndex];
	array[secondIndex] = firstValue;
    }
}
