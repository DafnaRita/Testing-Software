package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm;

public class Log5 {
    Ln ln;
    public Log5(Ln ln){
        this.ln = ln;
    }
    public double execute(double x){
        return ln.execute(x)/ln.execute(5);
    }
}
