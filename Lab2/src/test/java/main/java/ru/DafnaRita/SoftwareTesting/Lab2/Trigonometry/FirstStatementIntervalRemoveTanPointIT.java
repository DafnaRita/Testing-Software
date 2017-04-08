package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class FirstStatementIntervalRemoveTanPointIT {
    Sin sin;
    Cos cos;
    Cot cot;
    Sec sec;
    Tan tan;
    Csc csc;
    FirstStatement statement;
    double inputX;
    double expectedX;

    public FirstStatementIntervalRemoveTanPointIT(double inputX, double expectedX){
        this.inputX = inputX;
        this.expectedX = expectedX;
    }

    @Before
    public void init(){
        sin = new Sin();
        cos = new Cos(sin);
        cot = new Cot(sin, cos);
        sec = new Sec(cos, sin);
        tan = new Tan(sin, cos);
        csc = mock(Csc.class);
        statement = new FirstStatement(
                sin,
                cos,
                cot,
                sec,
                tan,
                csc
        );
        when(csc.execute(0.)).thenReturn(Double.NaN);
        when(csc.execute(-Math.PI/2)).thenReturn(-1.);
        when(csc.execute(-Math.PI)).thenReturn(Double.NaN);
        when(csc.execute(-1.5*Math.PI)).thenReturn(1.);
        when(csc.execute(-2*Math.PI)).thenReturn(Double.NaN);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, Double.NaN},
                {-0.5 * Math.PI, Double.NaN },
                {-Math.PI, Double.NaN},
                {-1.5 * Math.PI, Double.NaN},
                {2 * Math.PI, Double.NaN}
        });
    }

    @Test
    public void pointTest(){
        System.out.println(statement.execute(inputX));
        boolean isNan = Double.isNaN(statement.execute(inputX));
        boolean isInfinite = Double.isInfinite(statement.execute(inputX));
        assertTrue(isNan || isInfinite);
    }
}





