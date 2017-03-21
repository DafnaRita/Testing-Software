package ru.DafnaRita.SoftwareTesting.Lab1;

public class AtanFunction {
    public static double getAtan(double x) {
        double res = 0;
        res = 0;
        for (int n = 1; n <= 50000000; n++) {
            res += (n - 1) % 2 == 0 ? Math.pow(x, 2 * n - 1) / (2 * n - 1) : -Math.pow(x, 2 * n - 1) / (2 * n - 1);
        }
        return res;
    }
}
