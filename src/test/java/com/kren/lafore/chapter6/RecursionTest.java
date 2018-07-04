package com.kren.lafore.chapter6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RecursionTest {

    private final TrinagleValue two = new TrinagleValue(2, 3);
    private final TrinagleValue four = new TrinagleValue(4, 10);

    @Test
    void triangle() {
	assertEquals(two.value, Recursion.triangle(two.number));
	assertEquals(four.value, Recursion.triangle(four.number));
    }

    @Test
    void factorial() {
	assertEquals(2, Recursion.factorial(2));
	assertEquals(6, Recursion.factorial(3));
    }

}

class TrinagleValue {

    final int number;
    final int value;

    public TrinagleValue(int number, int value) {
	this.number = number;
	this.value = value;
    }

}
