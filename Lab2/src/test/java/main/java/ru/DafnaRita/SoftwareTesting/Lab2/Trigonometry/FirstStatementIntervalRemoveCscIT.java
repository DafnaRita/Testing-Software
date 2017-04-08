package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class FirstStatementIntervalRemoveCscIT {
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

    public FirstStatementIntervalRemoveCscIT(double inputX, double expectedX){
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
        csc = new Csc(sin);
        statement = new FirstStatement(
                sin,
                cos,
                cot,
                sec,
                tan,
                csc
        );
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
        if(Math.abs(statement.execute(inputX) - expectedX) < sin.delta*10){
            Assert.assertTrue(true);
        } else {
            fail();
        }
    }
}
