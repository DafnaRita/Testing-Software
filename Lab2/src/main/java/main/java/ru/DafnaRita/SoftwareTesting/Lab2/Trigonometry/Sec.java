package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;

public class Sec {
    Cos cos;
    Sin sin;
    public Sec(Cos cos, Sin sin){
        this.cos = cos;
        this.sin = sin;
    }

    public double execute(double x){
        if(Math.abs(x - 0) < sin.delta) { return 1; }
        if(Math.abs(x - Math.PI/2) < sin.delta) { return Double.NaN; }
        if(Math.abs(x - Math.PI) < sin.delta) { return -1; }
        if(Math.abs(x - 1.5*Math.PI) < sin.delta) { return Double.NaN; }
        if(Math.abs(x - 2*Math.PI) < sin.delta) { return 1; }

        if(Math.abs(x + 0) < sin.delta) { return 1; }
        if(Math.abs(x + Math.PI/2) < sin.delta) { return Double.NaN; }
        if(Math.abs(x + Math.PI) < sin.delta) { return -1; }
        if(Math.abs(x + 1.5*Math.PI) < sin.delta) { return Double.NaN; }
        if(Math.abs(x + 2*Math.PI) < sin.delta) { return 1; }
        return 1/cos.execute(x);
    }
}
