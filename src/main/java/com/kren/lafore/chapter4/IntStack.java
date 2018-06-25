package com.kren.lafore.chapter4;

public class IntStack {
    private static final int EMPTY_STACK_VALUE = -1;

    private final int[] stack;

    private int top;

    public IntStack(int size) {
	this.stack = new int[size];
	this.top = EMPTY_STACK_VALUE;
    }

    public void push(int value) {
	if (stack.length - 1 <= top) {
	    throw new UnsupportedOperationException("stack is full");
	}

	top++;
	stack[top] = value;

    }

    public int peek() {
	if (this.top == EMPTY_STACK_VALUE) {
	    throw new UnsupportedOperationException("stack is empty");
	}

	return stack[top];
    }

    public int pop() {
	int value = stack[top];
	top--;
	return value;
    }

}
