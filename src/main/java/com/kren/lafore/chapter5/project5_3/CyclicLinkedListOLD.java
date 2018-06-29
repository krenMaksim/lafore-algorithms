package com.kren.lafore.chapter5.project5_3;

import java.util.List;

public class CyclicLinkedListOLD<T> {
    private Element<T> first;
    private Element<T> last;
    private Element<T> current;

    private int size;

    public CyclicLinkedListOLD(List<T> list) {
	size = list.size();

	addAll(list);

	this.current = this.first;

    }

    private static final int FIRST_ELEMENT = 0;

    private void addAll(List<T> list) {
	Element<T> previous = null;

	for (int i = FIRST_ELEMENT; i < list.size(); i++) {

	    Element<T> current = new Element<T>(previous, list.get(i));
	    previous = current;

	    if (i == FIRST_ELEMENT) {
		this.first = current;
	    }
	}

	this.last = previous;
	this.last.setNext(first);
    }
}
