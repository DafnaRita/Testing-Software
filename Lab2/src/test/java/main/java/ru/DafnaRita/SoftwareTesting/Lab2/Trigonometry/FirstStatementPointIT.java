package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;

import org.jcp.xml.dsig.internal.dom.DOMBase64Transform;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


@RunWith(Parameterized.class)
public class FirstStatementPointIT {
    //point 0, -0.5pi, -pi, -1.5pi, -2pi
    Sin sin;
    Cos cos;
    Cot cot;
    Sec sec;
    Tan tan;
    Csc csc;
    FirstStatement statement;
    double inputX;
    double expectedX;

    public FirstStatementPointIT(double inputX, double expectedX){
        this.inputX = inputX;
        this.expectedX = expectedX;
    }

    @Before
    public void init(){
        sin = mock(Sin.class);
        cos = mock(Cos.class);
        cot = mock(Cot.class);
        sec = mock(Sec.class);
        tan = mock(Tan.class);
        csc = mock(Csc.class);
        statement = new FirstStatement(
                sin,
                cos,
                cot,
                sec,
                tan,
                csc
        );
        when(sin.execute(0.)).thenReturn(0.);
        when(sin.execute(-Math.PI/2)).thenReturn(-1.);
        when(sin.execute(-Math.PI)).thenReturn(0.);
        when(sin.execute(-1.5*Math.PI)).thenReturn(1.);
        when(sin.execute(-2*Math.PI)).thenReturn(0.);

        when(cos.execute(0.)).thenReturn(1.);
        when(cos.execute(Math.PI/2)).thenReturn(0.);
        when(cos.execute(Math.PI)).thenReturn(-1.);
        when(cos.execute(-1.5*Math.PI)).thenReturn(0.);
        when(cos.execute(-2*Math.PI)).thenReturn(1.);

        when(cot.execute(0.)).thenReturn(Double.NaN);
        when(cot.execute(Math.PI/2)).thenReturn(0.);
        when(cot.execute(Math.PI)).thenReturn(Double.NaN);
        when(cot.execute(-1.5*Math.PI)).thenReturn(0.);
        when(cot.execute(-2*Math.PI)).thenReturn(Double.NaN);

        when(sec.execute(0.)).thenReturn(1.);
        when(sec.execute(-Math.PI/2)).thenReturn(Double.NaN);
        when(sec.execute(-Math.PI)).thenReturn(-1.);
        when(sec.execute(-1.5*Math.PI)).thenReturn(Double.NaN);
        when(sec.execute(-2*Math.PI)).thenReturn(1.);

        when(tan.execute(0.)).thenReturn(0.);
        when(tan.execute(-Math.PI/2)).thenReturn(Double.NaN);
        when(tan.execute(-Math.PI)).thenReturn(-0.);
        when(tan.execute(-1.5*Math.PI)).thenReturn(Double.NaN);
        when(tan.execute(-2*Math.PI)).thenReturn(0.);

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
        boolean isNan = Double.isNaN(statement.execute(inputX));
        assertTrue(isNan);
    }
}
