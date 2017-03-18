package ru.DafnaRita.SoftwareTesting.Lab1;

public class AtanFunction {
    public static double getAtan(double x) {
        double res = 0;
        if (x > 1 || x < -1) {
            throw new RuntimeException("Error: the value must be between -1 to 1");
        }
        res = 0;
        for (int n = 1; n <= 5000; n++) {
            res += (n - 1) % 2 == 0 ? Math.pow(x, 2 * n - 1) / (2 * n - 1) : -Math.pow(x, 2 * n - 1) / (2 * n - 1);
        }
        return res;
    }
}
