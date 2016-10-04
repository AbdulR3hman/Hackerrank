package com.a3.TenDaysofStatistics;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by alab [AKA AbdulRehman Al-Faraj] on 03/10/2016.
 */
public class Day4BinomialDistributionI {

    public static void main(String[] args) {

        double p = 1.09/2.09;
        int x = 3;
        int n = 6;

        double sum = 0.0d;

        while (x <= n) {
            sum += binomial(x, n, p);
            x++;
        }

        System.out.println(new BigDecimal(sum).setScale(3, RoundingMode.HALF_UP));

    }

    public static double binomial(int x, int n, double p) {

        double q = 1.0 - p;
        return choose(n, x) * Math.pow(p, x) * Math.pow(q, n - x);
    }

    public static int choose(int m, int n) {
        return (fact(m) / (fact(n) * fact(m - n)));
    }

    public static int fact(int m) {
        if (m <= 1)
            return 1;
        else
            return m * fact(m - 1);
    }
}
