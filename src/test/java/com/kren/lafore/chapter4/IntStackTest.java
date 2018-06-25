package com.kren.lafore.chapter4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntStackTest {
    private static final int STACK_SIZE = 10;

    private static final int VALUE = 2;

    private IntStack stack = null;

    @BeforeEach
    void init() {
	stack = new IntStack(STACK_SIZE);
	stack.push(VALUE);
    }

    @Test
    void peek() {
	assertEquals(VALUE, stack.peek());
    }

    @Test
    void push() {
	assertEquals(VALUE, stack.peek());
    }

    @Test
    void pop() {
	assertEquals(VALUE, stack.pop());
    }

    @Test
    void peekEmptyStack() {
	stack.pop();
	assertThrows(UnsupportedOperationException.class,
	        () -> {
	            stack.peek();
	        });
    }
}
