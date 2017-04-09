package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm;

public class SecondStatement {
    Ln ln;
    Log2 log2;
    Log3 log3;
    Log5 log5;

    public SecondStatement(Ln ln, Log2 log2, Log3 log3, Log5 log5) {
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log5 = log5;
    }

    public double execute(double x){
        if(x > 0){
            return (((((ln.execute(x) / log3.execute(x)) * log5.execute(x))
                    - ln.execute(x)) / log3.execute(x))
                    + (log5.execute(x)
                    * (Math.pow(Math.pow(log2.execute(x), 3), 3))));
        } else{
            return Double.NaN;
        }
    }
}
