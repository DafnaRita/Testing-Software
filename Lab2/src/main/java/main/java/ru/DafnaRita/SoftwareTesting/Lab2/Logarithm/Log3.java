package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm;

public class Log3 {
    Ln ln;
    public Log3(Ln ln){
        this.ln = ln;
    }
    public double execute(double x){
        return ln.execute(x)/ln.execute(3);
    }
}
