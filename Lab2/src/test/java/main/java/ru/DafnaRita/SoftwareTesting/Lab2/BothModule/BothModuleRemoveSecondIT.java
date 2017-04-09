package main.java.ru.DafnaRita.SoftwareTesting.Lab2.BothModule;

import main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm.*;
import main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry.*;
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
public class BothModuleRemoveSecondIT {
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

    public BothModuleRemoveSecondIT(double inputX, double expectedX){
        this.inputX = inputX;
        this.expectedX = expectedX;
    }

    @Before
    public void init(){
        Sin sin = new Sin();
        Cos cos = new Cos(sin);
        firstStatement = new FirstStatement(
                sin,
                cos,
                new Cot(sin, cos),
                new Sec(cos, sin),
                new Tan(sin, cos),
                new Csc(sin)
        );
        System.out.println("delta: " + delta);

        Ln ln = new Ln();
        Log2 log2 = new Log2(ln);
        Log3 log3 = new Log3(ln);
        Log5 log5 = new Log5(ln);
        secondStatement = new SecondStatement(ln, log2, log3, log5);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0. ,Double.NaN},
                {0. - delta, -3.9997995401137*Math.pow(10,8)},
                {-0.2*Math.PI, 0.77861733},
                {-0.4*Math.PI,9.9123206},
                {-0.5*Math.PI + delta, 2.00029966504*Math.pow(10,8)},//4
                {-0.5*Math.PI, Double.NaN},
                {-0.5*Math.PI - delta, 1.999699664827189*Math.pow(10,8)},//6
                {-0.6*Math.PI, 0.97666403},
                {-0.8*Math.PI, -0.893378161},
                {-Math.PI - delta, -4.003790251*Math.pow(10,8)},
                {-Math.PI, Double.NaN},
                {-Math.PI + delta, -3.9962160034*Math.pow(10,8)},//11
                {-1.2*Math.PI, -2.8432998},
                {-1.4*Math.PI, 5.0291067},
                {-1.5*Math.PI-delta, (2.001694565*Math.pow(10,8))},//14
                {0.,Double.NaN},
                {0.+ delta, 1.4973*Math.pow(10, 11)},
                {0.6,-0.32833997},
                {1. + delta,-0.34869274},
                {1.,Double.NaN},
                {1. - delta, -0.34869274},
                {1.8,-0.26588061}
        });
    }

    @Test
    public void pointTest(){
        System.out.println("inputX :" + inputX);
        System.out.println("expectedX :" + expectedX);
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
            System.out.println("secondStatement :" + secondStatement.execute(inputX));
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




