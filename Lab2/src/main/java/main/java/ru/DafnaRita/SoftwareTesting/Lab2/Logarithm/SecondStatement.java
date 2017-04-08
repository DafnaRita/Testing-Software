package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm;

import java.math.BigDecimal;

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

    public double pow(double x){
        int i;
        for(i = 0; i < 9; i++){
            x = x * x;
        }
        return x;
    }

    public double execute(double x){
        if(x > 0){
            return (((((ln.execute(x) / log3.execute(x)) * log5.execute(x))
                    - ln.execute(x)) / log3.execute(x))
                    + (log5.execute(x)
                    * (this.pow(log2.execute(x)))));
        } else{
            return Double.NaN;
        }
        /*System.out.println("ln.execute(x)" + ln.execute(x));
        System.out.println("log2.execute(x)" + log2.execute(x));
        System.out.println("log3.execute(x)" + log3.execute(x));
        System.out.println("log5.execute(x)" + log5.execute(x));*/
        //return ln.execute(x);
    }
}
