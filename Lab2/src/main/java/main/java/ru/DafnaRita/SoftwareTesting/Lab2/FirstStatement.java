package main.java.ru.DafnaRita.SoftwareTesting.Lab2;

public class FirstStatement {
    Sin sin;
    Cos cos;
    Cot cot;
    Sec sec;
    Tan tan;
    Csc csc;

    FirstStatement(Sin sin, Cos cos, Cot cot, Sec sec, Tan tan, Csc csc){
        this.sin = sin;
        this.cos = cos;
        this.cot = cot;
        this.sec = sec;
        this.tan = tan;
        this.csc = csc;
    }

    public double execute(double x){
        return (((((sin.execute(x) + tan.execute(x))
                / cot.execute(x))
                / ((csc.execute(x) + sin.execute(x)) / sin.execute(x)))
                - ((cot.execute(x) + sec.execute(x)) * (csc.execute(x) * cos.execute(x))))
                - tan.execute(x));
    }
}
