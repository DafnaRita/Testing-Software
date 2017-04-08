package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(Parameterized.class)
public class SecondStatementIT {
    // 0
    // 0.6
    // 1.8
    // 1
    Ln ln;
    Log2 log2;
    Log3 log3;
    Log5 log5;
    SecondStatement statement;
    public double inputX;
    public double expectedX;

    public SecondStatementIT(double inputX, double expectedX){
        this.inputX = inputX;
        this.expectedX = expectedX;
    }

    @Before
    public void init(){
        ln = mock(Ln.class);
        log2 = mock(Log2.class);
        log3 = mock(Log3.class);
        log5 = mock(Log5.class);
        statement = new SecondStatement(ln, log2, log3, log5);

        when(ln.execute(0.)).thenReturn(Double.NaN);
        when(ln.execute(0.+ Ln.precision)).thenReturn(-12.206073);
        when(ln.execute(0.6)).thenReturn(-0.51082562);
        when(ln.execute(1.- Ln.precision)).thenReturn(-0.000005);
        when(ln.execute(1.)).thenReturn(0.);
        when(ln.execute(1. + Ln.precision)).thenReturn(0.00000499998);
        when(ln.execute(1.8)).thenReturn(0.58778666);

        when(log2.execute(0.)).thenReturn(Double.NaN);
        when(log2.execute(0.+ Ln.precision)).thenReturn(-5.);
        when(log2.execute(0.6)).thenReturn(0.079181246);
        when(log2.execute(1.- Ln.precision)).thenReturn(0.30102782);
        when(log2.execute(1.)).thenReturn(0.30103);
        when(log2.execute(1. + Ln.precision)).thenReturn(0.30103217);
        when(log2.execute(1.8)).thenReturn(0.5563025);

        when(log3.execute(0.)).thenReturn(Double.NaN);
        when(log3.execute(0.+ Ln.precision)).thenReturn(-4.8239087);
        when(log3.execute(0.6)).thenReturn(0.25527251);
        when(log3.execute(1.- Ln.precision)).thenReturn(0.47711908);
        when(log3.execute(1.)).thenReturn(0.47712125);
        when(log3.execute(1. + Ln.precision)).thenReturn(0.47712343);
        when(log3.execute(1.8)).thenReturn(0.73239376);

        when(log5.execute(0.)).thenReturn(Double.NaN);
        when(log5.execute(0.+ Ln.precision)).thenReturn(-4.60206);
        when(log5.execute(0.6)).thenReturn(0.47712125);
        when(log5.execute(1.- Ln.precision)).thenReturn(0.69896783);
        when(log5.execute(1.)).thenReturn(0.69897);
        when(log5.execute(1. + Ln.precision)).thenReturn(0.69897218);
        when(log5.execute(1.8)).thenReturn(0.95424251);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0., Double.NaN},
                {0.+ Ln.precision, Double.POSITIVE_INFINITY},
                {0.6, -0.32833997},
                {1.- Ln.precision, -0.34869274},
                {1., Double.NaN},
                {1.+ Ln.precision, -0.34869274},
                {1.8 , -0.26588061},
        });
    }

    @Test
    public void pointTest(){
        System.out.println("input: " + inputX + " expected: " + expectedX);
        System.out.println("gotten: " + statement.execute(inputX));

        if(Double.isInfinite(statement.execute(inputX)) ||
                Double.isNaN(statement.execute(inputX))) {
            System.out.println("nan");
            boolean isNan = Double.isNaN(statement.execute(inputX));
            boolean isInfinity = Double.isNaN(statement.execute(inputX));
            assertTrue(isNan || isInfinity);
        } else if(Math.abs(statement.execute(inputX) - expectedX) < Ln.precision*100){
            System.out.println("not nan");
            Assert.assertTrue(true);
        } else {
            System.out.println("not nan but error");
            fail();
        }
    }
}

