package ru.DafnaRita.SoftwareTesting.Lab1;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

public class AtanFunctionTest {

    static double EPSILON = 1e-8;
    static double DENSYTY_STEP = 0.001;

    boolean equals(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    @Test
    @Ignore
    public void atan1Test1 () {
        double value = -999999999;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan1Test2 () {
        double value = -500;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan1Test3 () {
        double value = -2;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan2Test1 () {
        double value = -0.9;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }


    @Test
    @Ignore
    public void atan2Test2 () {
        double value = -0.8;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan2Test3 () {
        double value = -0.2;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan3Test1 () {
        double value = 0.2;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan3Test2 () {
        double value = 0.4;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan3Test3 () {
        double value = 0.8;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan3Test4 () {
        double value = 0.9;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan4Test1 () {
        double value = 5;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan4Test2 () {
        double value = 500;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    @Ignore
    public void atan4Test3 () {
        double value = 99999;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }
/*
*
 */
    @Test
    public void atanPoint1Test1 () {
        double value = -1 - EPSILON;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanPoint1Test2 () {
        double value = -1;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanPoint1Test3 () {
        double value = -1 + EPSILON;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanPoint2Test1 () {
        double value = 0 -EPSILON;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanPoint2Test2 () {
        double value = 0;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test
    public void atanPoint2Test3 () {
        double value = 0 + EPSILON;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test (expected = RuntimeException.class)
    public void atanPoint3Test1 () {
        double value = 1 - EPSILON;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test (expected = RuntimeException.class)
    public void atanPoint3Test2 () {
        double value = 1 ;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }

    @Test (expected = RuntimeException.class)
    public void atanPoint3Test3 () {
        double value = 1 + EPSILON;
        if (!equals(AtanFunction.getAtan(value), Math.atan(value))) {
            fail("AtanFunction.getAtan() test failed for EPSILON=" + EPSILON);
        }
    }
}
