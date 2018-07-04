package com.kren.lafore.chapter6;

public class Recursion {

    private Recursion() {
	throw new AssertionError();
    }

    private static final int FIRST_TRIANGLE_NUMBER = 1;
    private static final int FIRST_TRIANGLE_VALUE = 1;

    public static int triangle(int n) {
	if (n < FIRST_TRIANGLE_NUMBER) {
	    throw new IllegalArgumentException();
	}

	if (n == FIRST_TRIANGLE_NUMBER) {
	    return FIRST_TRIANGLE_VALUE;
	} else {
	    return n + triangle(n - 1);
	}
    }

    private static final int FIRST_FACTORIAL_NUMBER = 0;
    private static final int FIRST_FACTORIAL_VALUE = 1;

    public static int factorial(int n) {
	if (n < FIRST_FACTORIAL_NUMBER) {
	    throw new IllegalArgumentException();
	}

	if (n == FIRST_TRIANGLE_NUMBER) {
	    return FIRST_FACTORIAL_VALUE;
	} else {
	    return n * factorial(n - 1);
	}
    }
}
