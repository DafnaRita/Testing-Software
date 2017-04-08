package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class FirstStatementIntervalRemoveCscPointIT {
    Sin sin;
    Cos cos;
    Cot cot;
    Sec sec;
    Tan tan;
    Csc csc;
    FirstStatement statement;
    double inputX;
    double expectedX;

    public FirstStatementIntervalRemoveCscPointIT(double inputX, double expectedX){
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






