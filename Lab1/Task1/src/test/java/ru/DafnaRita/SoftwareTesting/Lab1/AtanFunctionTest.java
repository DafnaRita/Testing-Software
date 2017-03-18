package ru.DafnaRita.SoftwareTesting.Lab1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AtanFunctionTest {

    static double EPSILON = 1e-8;
    static double DENSYTY_STEP = 0.001;

    boolean equals(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    @Test
    public void atanAllowableTest1 () {
        double value = 0.23;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanAllowableTest2 () {
        double value = -0.23;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanAllowableTest3 () {
        double value = 0.9;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanAllowableTest4 () {
        double value = -0.9;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test (expected = RuntimeException.class)
    public void atanNotAllowableTestNegative3345345 () {
        double value = -3345345;
        try {
            AtanFunction.getAtan(value);
        } catch (RuntimeException e) {
            String message = "Error: the value must be between -1 to 1";
            assertEquals(message, e.getMessage());
            throw e;
        }
    }

    @Test (expected = RuntimeException.class)
    public void atanNotAllowableTest234234 () {
        double value = 234234;
        try {
            AtanFunction.getAtan(value);
        } catch (RuntimeException e) {
            String message = "Error: the value must be between -1 to 1";
            assertEquals(message, e.getMessage());
            throw e;
        }
    }

    @Test (expected = RuntimeException.class)
    public void atanNotAllowableTest3 () {
        double value = 3;
        try {
            AtanFunction.getAtan(value);
        } catch (RuntimeException e) {
            String message = "Error: the value must be between -1 to 1";
            assertEquals(message, e.getMessage());
            throw e;
        }
    }

    @Test (expected = RuntimeException.class)
    public void atanNotAllowableTest5 () {
        double value = 5;
        try {
            AtanFunction.getAtan(value);
        } catch (RuntimeException e) {
            String message = "Error: the value must be between -1 to 1";
            assertEquals(message, e.getMessage());
            throw e;
        }
    }
}
