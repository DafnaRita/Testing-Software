package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class SecondStatementRemoveLog5IT {
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

    public SecondStatementRemoveLog5IT(double inputX, double expectedX){
        this.inputX = inputX;
        this.expectedX = expectedX;
    }

    @Before
    public void init(){
        ln = new Ln();
        log2 = new Log2(ln);
        log3 = new Log3(ln);
        log5 = mock(Log5.class);
        statement = new SecondStatement(ln, log2, log3, log5);

        when(log5.execute(0.)).thenReturn(Double.NaN);
        when(log5.execute(0.+ Ln.precision)).thenReturn(-7.5840593);
        when(log5.execute(0.6)).thenReturn(-0.31739381);
        when(log5.execute(1.- Ln.precision)).thenReturn(-3.106682*Math.pow(10, -6));
        when(log5.execute(1.)).thenReturn(0.);
        when(log5.execute(1. + Ln.precision)).thenReturn(3.106667*Math.pow(10, -6));
        when(log5.execute(1.8)).thenReturn(0.36521239);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0., Double.NaN},
                {0.+ Ln.precision, 1.0984392017668677 * Math.pow(10, 12)},
                {0.6, -0.32833997},
                {1.- Ln.precision, -0.34869274},
                {1., Double.NaN},
                {1.+ Ln.precision, -0.34869274},
                {1.8 , -0.26588061},
        });
    }

    @Test
    public void pointTest(){
        if(Double.isInfinite(statement.execute(inputX)) ||
                Double.isNaN(statement.execute(inputX))) {
            boolean isNan = Double.isNaN(statement.execute(inputX));
            boolean isInfinity = Double.isNaN(statement.execute(inputX));
            assertTrue(isNan || isInfinity);
        } else if(Math.abs(statement.execute(inputX) - expectedX) < Ln.precision*10000){
            Assert.assertTrue(true);
        } else {
            System.out.println("statement.execute(" + inputX + " ): " + statement.execute(inputX));
            System.out.println("ожидаемое: " + expectedX);
            System.out.println("not nan but error");
            fail();
        }
    }
}






