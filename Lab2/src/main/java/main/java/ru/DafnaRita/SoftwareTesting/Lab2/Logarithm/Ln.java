package main.java.ru.DafnaRita.SoftwareTesting.Lab2.Logarithm;

public class Ln {
    static double precision = 0.000005;  // set this to whatever delta you want

    public double execute(double x) {
        double y = 0;

        double delta = 1;
        for (int n = 0; delta > precision; n++) {
            delta = y;
            double d = 2.0 / (2.0 * n + 1) * Math.pow(((x - 1.0) / (x + 1.0)), 2.0 * n + 1.0);
            y += d;
            delta = Math.abs(y - delta);
        }

        return y;
    }
}
