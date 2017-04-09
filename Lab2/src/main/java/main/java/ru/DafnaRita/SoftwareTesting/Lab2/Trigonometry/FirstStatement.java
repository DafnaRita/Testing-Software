package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;

public class FirstStatement {
    Sin sin;
    Cos cos;
    Cot cot;
    Sec sec;
    Tan tan;
    Csc csc;
    public double delta = 0.000005;

    public FirstStatement(Sin sin, Cos cos, Cot cot, Sec sec, Tan tan, Csc csc){
        this.sin = sin;
        this.cos = cos;
        this.cot = cot;
        this.sec = sec;
        this.tan = tan;
        this.csc = csc;
    }

    public double execute(double x){
        if (!(x <= 0)){
            return Double.NaN;
        }
        return (((((sin.execute(x) + tan.execute(x))
                / cot.execute(x))
                / ((csc.execute(x) + sin.execute(x)) / sin.execute(x)))
                - ((cot.execute(x) + sec.execute(x)) * (csc.execute(x) * cos.execute(x))))
                - tan.execute(x));
    }
}
