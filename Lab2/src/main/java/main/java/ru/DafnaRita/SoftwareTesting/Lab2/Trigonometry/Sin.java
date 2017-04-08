package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;

public class Sin {

    public double delta = 0.0000005;// or whatever limit you want
    public double execute(double x){
        double sin = 0.;
        int n = 1;
        double term = x;
        while ( Math.abs(term) > delta) {
            sin += term;
            term *= -( (x/(n+1)) * (x/(n+2)) );
            n+= 2;
        }
        return sin;
    }
}
