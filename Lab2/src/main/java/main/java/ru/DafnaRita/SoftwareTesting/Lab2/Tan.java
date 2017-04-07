package main.java.ru.DafnaRita.SoftwareTesting.Lab2;

public class Tan {
    Sin sin;
    Cos cos;
    public Tan(Sin sin, Cos cos){
        this.sin = sin;
        this.cos = cos;
    }

    public double execute(double x){
        if(Math.abs(x - 0) < sin.delta) { return 0; }
        if(Math.abs(x - Math.PI/2) < sin.delta) { return Double.NaN; }
        if(Math.abs(x - Math.PI) < sin.delta) { return 0; }
        if(Math.abs(x - 1.5*Math.PI) < sin.delta) { return Double.NaN; }
        if(Math.abs(x - 2*Math.PI) < sin.delta) { return 0; }

        if(Math.abs(x + 0) < sin.delta) { return 0; }
        if(Math.abs(x + Math.PI/2) < sin.delta) { return Double.NaN; }
        if(Math.abs(x + Math.PI) < sin.delta) { return 0; }
        if(Math.abs(x + 1.5*Math.PI) < sin.delta) { return Double.NaN; }
        if(Math.abs(x + 2*Math.PI) < sin.delta) { return 0; }

        return sin.execute(x)/cos.execute(x);
    }
}
