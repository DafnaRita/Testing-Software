package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Trigonometry;

public class Cos{
    Sin sin;
    public Cos(Sin sin){
        this.sin = sin;
    }

    public double execute(double x){
        if(Math.abs(x - 0) < sin.delta) { return 1; }
        if(Math.abs(x - Math.PI/2) < sin.delta) { return 0; }
        if(Math.abs(x - Math.PI) < sin.delta) { return -1; }
        if(Math.abs(x - 1.5*Math.PI) < sin.delta) { return 0; }
        if(Math.abs(x - 2*Math.PI) < sin.delta) { return 1; }

        if(Math.abs(x + 0) < sin.delta) { return 1; }
        if(Math.abs(x + Math.PI/2) < sin.delta) { return 0; }
        if(Math.abs(x + Math.PI) < sin.delta) { return -1; }
        if(Math.abs(x + 1.5*Math.PI) < sin.delta) { return 0; }
        if(Math.abs(x + 2*Math.PI) < sin.delta) { return 1; }
        return sin.execute(x + Math.PI/2);
    }
}
