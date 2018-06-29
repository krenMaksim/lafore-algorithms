package com.kren.lafore.chapter5.project5_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CyclicLinkedList<T> implements Iterable<T> {

    private LinkedList<T> linkedList;

    public CyclicLinkedList(List<T> list) {
	this.linkedList = new LinkedList<>(list);
    }

    public T find(int elementNumber) {
	if (elementNumber < 1 || elementNumber > linkedList.size()) {
	    elementNumber = getCurrentIndex(elementNumber, linkedList.size());
	}

	return linkedList.get(elementNumber - 1);
    }

    public void insert(int elementNumber, T value) {
	int index = getCurrentIndex(elementNumber, linkedList.size()) - 1;

	linkedList.add(index, value);
    }

    public void delete(int elementNumber) {
	int index = getCurrentIndex(elementNumber, linkedList.size()) - 1;

	linkedList.remove(index);
    }

    @Override
    public Iterator<T> iterator() {
	return linkedList.iterator();
    }

    private static int getCurrentIndex(int elementNumber, int listSize) {
	if (elementNumber == 0) {
	    throw new IllegalArgumentException();
	}

	if (elementNumber < 0) {
	    int absValue = Math.abs(elementNumber);

	    if (absValue > listSize) {
		int rest = absValue % listSize;
		if (rest == 0) {
		    return 1;
		} else {
		    return listSize - elementNumber % absValue;
		}

	    } else {
		return listSize + 1 - absValue;
	    }
	} else {
	    int rest = elementNumber % listSize;

	    if (rest == 0) {
		return listSize;
	    } else {
		return elementNumber % listSize;
	    }
	}
    }
}
