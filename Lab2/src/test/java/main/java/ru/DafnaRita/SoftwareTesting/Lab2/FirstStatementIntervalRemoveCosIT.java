package main.java.ru.DafnaRita.SoftwareTesting.Lab2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class FirstStatementIntervalRemoveCosIT {
    // (0, 0.5pi) - 0.2pi and 0.4pi
    // (0.5pi, pi) - 0.6pi and 0.8pi
    // (pi, 1.5pi) - 1.2pi and 1.4pi
    // (1.5pi, 2pi) - 1.6pi and 1.8pi
    Sin sin;
    Cos cos;
    Cot cot;
    Sec sec;
    Tan tan;
    Csc csc;
    FirstStatement statement;
    double inputX;
    double expectedX;

    public FirstStatementIntervalRemoveCosIT(double inputX, double expectedX){
        this.inputX = inputX;
        this.expectedX = expectedX;
    }

    @Before
    public void init(){
        sin = new Sin();
        cos = new Cos(sin);
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

        when(cot.execute(-0.2*Math.PI)).thenReturn(-1.3763819);
        when(cot.execute(-0.4*Math.PI)).thenReturn(-0.3249197);
        when(cot.execute(-0.6*Math.PI)).thenReturn(0.3249197);
        when(cot.execute(-0.8*Math.PI)).thenReturn(1.3763819);
        when(cot.execute(-1.2*Math.PI)).thenReturn(-1.3763819);
        when(cot.execute(-1.4*Math.PI)).thenReturn(-0.3249197);
        when(cot.execute(-1.6*Math.PI)).thenReturn(0.3249197);
        when(cot.execute(-1.8*Math.PI)).thenReturn(1.3763819);

        when(sec.execute(-0.2*Math.PI)).thenReturn(1.236068);
        when(sec.execute(-0.4*Math.PI)).thenReturn(3.236068);
        when(sec.execute(-0.6*Math.PI)).thenReturn(-3.236068);
        when(sec.execute(-0.8*Math.PI)).thenReturn(-1.236068);
        when(sec.execute(-1.2*Math.PI)).thenReturn(-1.236068);
        when(sec.execute(-1.4*Math.PI)).thenReturn(-3.236068);
        when(sec.execute(-1.6*Math.PI)).thenReturn(3.236068);
        when(sec.execute(-1.8*Math.PI)).thenReturn(1.236068);

        when(tan.execute(-0.2*Math.PI)).thenReturn(-0.72654253);
        when(tan.execute(-0.4*Math.PI)).thenReturn(-3.0776835);
        when(tan.execute(-0.6*Math.PI)).thenReturn(3.0776835);
        when(tan.execute(-0.8*Math.PI)).thenReturn(0.72654253);
        when(tan.execute(-1.2*Math.PI)).thenReturn(-0.72654253);
        when(tan.execute(-1.4*Math.PI)).thenReturn(-3.0776835);
        when(tan.execute(-1.6*Math.PI)).thenReturn(3.0776835);
        when(tan.execute(-1.8*Math.PI)).thenReturn(0.72654253);

        when(csc.execute(-0.2*Math.PI)).thenReturn(-1.7013016);
        when(csc.execute(-0.4*Math.PI)).thenReturn(-1.0514622);
        when(csc.execute(-0.6*Math.PI)).thenReturn(-1.0514622);
        when(csc.execute(-0.8*Math.PI)).thenReturn(-1.7013016);
        when(csc.execute(-1.2*Math.PI)).thenReturn(1.7013016);
        when(csc.execute(-1.4*Math.PI)).thenReturn(1.0514622);
        when(csc.execute(-1.6*Math.PI)).thenReturn(1.0514622);
        when(csc.execute(-1.8*Math.PI)).thenReturn(1.7013016);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {-0.2*Math.PI, 0.77861733},
                {-0.4*Math.PI, 9.9123206},
                {-0.6*Math.PI, 0.97666403},
                {-0.8*Math.PI, -0.89378161},
                {-1.2*Math.PI, -2.8432998},
                {-1.4*Math.PI, 5.0291067},
                {-1.6*Math.PI, 1.6540291},
                {-1.8*Math.PI, -4.077071}
        });
    }

    @Test
    public void pointTest(){
        System.out.println(statement.execute(inputX));
        System.out.println(expectedX);
        System.out.println("\n");
        if(Math.abs(statement.execute(inputX) - expectedX) < sin.delta*5){
            Assert.assertTrue(true);
        } else {
            fail();
        }
    }
}


