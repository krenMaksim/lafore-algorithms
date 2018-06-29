package com.kren.lafore.chapter5.project5_3;

class Element<T> {
    private Element<T> next;

    private T data;

    public Element(Element<T> next, T data) {
	this.next = next;
	this.data = data;
    }

    public void setNext(Element<T> next) {
	this.next = next;
    }
}
