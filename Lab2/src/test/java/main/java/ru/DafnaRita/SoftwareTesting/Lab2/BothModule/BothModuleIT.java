package main.java.ru.DafnaRita.SoftwareTesting.Lab2.BothModule;

import main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm.*;
import main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry.FirstStatement;
import main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry.Sin;
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
public class BothModuleIT {
    //trigonometry
    // (0, -0.5pi) : -0.2pi and -0.4pi
    // (-0.5pi, -pi) : -0.6pi and -0.8pi
    // (-pi, -1.5pi) : -1.2pi and -1.4pi
    // (-1.5pi, -2pi) : -1.6pi and -1.8pi

    //logs
    // 0
    // 0 + delta
    // 0.6
    // 1 - delta
    // 1
    // 1 + delta
    // 1.8
    FirstStatement firstStatement;
    SecondStatement secondStatement;
    public double inputX;
    public double expectedX;
    static double delta = 0.00005;

    public BothModuleIT(double inputX, double expectedX){
        this.inputX = inputX;
        this.expectedX = expectedX;
    }

    @Before
    public void init(){
        firstStatement = mock(FirstStatement.class);
        secondStatement = mock(SecondStatement.class);
        System.out.println("delta: " + delta);
        when(firstStatement.execute(0.)).thenReturn(Double.NaN);
        when(firstStatement.execute(0. - delta)).thenReturn(-3.99998*Math.pow(10,10));

        when(firstStatement.execute(-0.2*Math.PI)).thenReturn(0.77861733);
        when(firstStatement.execute(-0.4*Math.PI)).thenReturn(9.9123206);

        when(firstStatement.execute(-0.5*Math.PI + delta)).thenReturn(-1.99997*Math.pow(10,10));
        when(firstStatement.execute(-0.5*Math.PI)).thenReturn(Double.NaN);
        when(firstStatement.execute(-0.5*Math.PI - delta)).thenReturn(-2.00003*Math.pow(10,10));

        when(firstStatement.execute(-0.6*Math.PI)).thenReturn(0.97666403);
        when(firstStatement.execute(-0.8*Math.PI)).thenReturn(-0.89378161);

        when(firstStatement.execute(-Math.PI - delta)).thenReturn(-4.00002*Math.pow(10,10));
        when(firstStatement.execute(-Math.PI)).thenReturn(Double.NaN);
        when(firstStatement.execute(-Math.PI + delta)).thenReturn(-3.99998*Math.pow(10,10));

        when(firstStatement.execute(-1.2*Math.PI)).thenReturn(-2.8432998);
        when(firstStatement.execute(-1.4*Math.PI)).thenReturn(5.0291067);

        when(firstStatement.execute(-1.5*Math.PI+delta)).thenReturn(2.00001*Math.pow(10,10));
        when(firstStatement.execute(-1.5*Math.PI)).thenReturn(Double.NaN);
        when(firstStatement.execute(-1.5*Math.PI-delta)).thenReturn(1.99999*Math.pow(10,10));

        when(firstStatement.execute(-1.6*Math.PI)).thenReturn(1.65402921);
        when(firstStatement.execute(-1.8*Math.PI)).thenReturn(-4.077071);

        when(firstStatement.execute(-2*Math.PI+delta)).thenReturn(-4.00002*Math.pow(10,10));
        when(firstStatement.execute(-2*Math.PI)).thenReturn(Double.NaN);

        /**/

        when(secondStatement.execute(0.)).thenReturn(Double.NaN);
        when(secondStatement.execute(0.+ delta)).thenReturn(1.234969*Math.pow(10, 12));
        when(secondStatement.execute(0.6)).thenReturn(-0.32833997);
        when(secondStatement.execute(1. + delta)).thenReturn(-0.34869274);
        when(secondStatement.execute(1.)).thenReturn(Double.NaN);
        when(secondStatement.execute(1. - delta)).thenReturn(-0.34869274);
        when(secondStatement.execute(1.8)).thenReturn(-0.26588061);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0. ,Double.NaN},
                {0. - delta, -3.99998*Math.pow(10,10)},
                {-0.2*Math.PI, 0.77861733},
                {-0.4*Math.PI,9.9123206},//3
                {-0.5*Math.PI + delta, -1.99997*Math.pow(10,10)},
                {-0.5*Math.PI, Double.NaN},//5
                {-0.5*Math.PI - delta, -2.00003*Math.pow(10,10)},//6
                {-0.6*Math.PI, 0.97666403},
                {-0.8*Math.PI, -0.893378161},//8
                {-Math.PI - delta, -4.00002*Math.pow(10,10)},
                {-Math.PI, Double.NaN},//10
                {-Math.PI + delta, -3.99998*Math.pow(10,10)},
                {-1.2*Math.PI, -2.8432998},//12
                {-1.4*Math.PI, 5.0291067},
                {-1.5*Math.PI-delta, (1.99999*Math.pow(10,10))},//14
                {0.,Double.NaN},
                {0.+ delta, 1.234969*Math.pow(10, 12)},//16
                {0.6,-0.32833997},
                {1. + delta,-0.34869274},//18
                {1.,Double.NaN},
                {1. - delta, -0.34869274},//20
                {1.8,-0.26588061}
        });
    }

    @Test
    public void pointTest(){
        if(inputX <= 0) {
            if(Double.isNaN(expectedX)) {
                System.out.println("должен быть NAN, а получен: " + firstStatement.execute(inputX));
                boolean isNan = Double.isNaN(firstStatement.execute(inputX));
                assertTrue(isNan);
            } else if(Math.abs(firstStatement.execute(inputX) - expectedX) < delta*10000){
                System.out.println("statement.execute(" + inputX + " ): " + firstStatement.execute(inputX));
                System.out.println("ожидаемое: " + expectedX);
                System.out.println("not nan but error");
                Assert.assertTrue(true);
            } else {
                fail();
            }
        } else{
            if(Double.isNaN(expectedX)) {
                System.out.println("должен быть NAN, а получен: " + secondStatement.execute(inputX));
                boolean isNan = Double.isNaN(secondStatement.execute(inputX));
                assertTrue(isNan);
            } else if(Math.abs(secondStatement.execute(inputX) - expectedX) < delta*10000){
                System.out.println("statement.execute(" + inputX + " ): " + secondStatement.execute(inputX));
                System.out.println("ожидаемое: " + expectedX);
                System.out.println("not nan but error");
                Assert.assertTrue(true);
            } else {
                fail();
            }
        }
    }
}


