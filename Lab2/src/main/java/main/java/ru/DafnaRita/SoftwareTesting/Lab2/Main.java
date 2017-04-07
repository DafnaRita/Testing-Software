package main.java.ru.DafnaRita.SoftwareTesting.Lab2;


public class Main {
    public  static void main(String[] args){
        Sin sin = new Sin();
        Cos cos = new Cos(sin);
        FirstStatement statement = new FirstStatement(
                sin,
                cos,
                new Cot(sin, cos),
                new Sec(cos, sin),
                new Tan(sin, cos),
                new Csc(sin)
        );
        Cot cot = new Cot(sin, cos);
        Sec sec = new Sec(cos, sin);
        Tan tan = new Tan(sin, cos);
        Csc csc = new Csc(sin);

        System.out.println("sin");
        System.out.println(sin.execute(0.2*Math.PI));
        System.out.println(sin.execute(0.4*Math.PI));
        System.out.println(sin.execute(0.6*Math.PI));
        System.out.println(sin.execute(0.8*Math.PI));
        System.out.println(sin.execute(1.2*Math.PI));
        System.out.println(sin.execute(1.4*Math.PI));

        System.out.println("cos");
        System.out.println(sin.execute(0.2*Math.PI));
        System.out.println(sin.execute(0.4*Math.PI));
        System.out.println(sin.execute(0.6*Math.PI));
        System.out.println(sin.execute(0.8*Math.PI));
        System.out.println(sin.execute(1.2*Math.PI));
        System.out.println(sin.execute(1.4*Math.PI));

        System.out.println("execute");
        System.out.println("0: "+sec.execute(0));
        System.out.println("pi/2: "+sec.execute(Math.PI*0.5));
        System.out.println("pi: "+sec.execute(Math.PI));
        System.out.println("3/2pi: "+sec.execute(Math.PI*1.5));

        System.out.println("Tan");
        System.out.println("0: "+tan.execute(0));
        System.out.println("pi/2: "+tan.execute(Math.PI*0.5));
        System.out.println("pi: "+tan.execute(Math.PI));
        System.out.println("3/2pi: "+tan.execute(Math.PI*1.5));

        System.out.println("csc");
        System.out.println("0: "+csc.execute(0));
        System.out.println("pi/2: "+csc.execute(Math.PI*0.5));
        System.out.println("pi: "+csc.execute(Math.PI));
        System.out.println("3/2pi: "+csc.execute(Math.PI*1.5));

        System.out.println("cot");
        System.out.println("0: "+cot.execute(0));
        System.out.println("pi/2: "+cot.execute(Math.PI*0.5));
        System.out.println("pi: "+cot.execute(Math.PI));
        System.out.println("3/2pi: "+cot.execute(Math.PI*1.5));
    }
}
