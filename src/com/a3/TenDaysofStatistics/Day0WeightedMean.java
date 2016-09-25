package com.a3.TenDaysofStatistics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AbdulR3hman on 25/09/2016.
 */
public class Day0WeightedMean {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        ArrayList<Integer> points = new ArrayList<Integer>();
        ArrayList<Integer> weights = new ArrayList<Integer>();

        for (int i = 0; i < len; i++)
            points.add(sc.nextInt());

        for (int i = 0; i < len; i++)
            weights.add(sc.nextInt());

        double totalWP = 0;
        double totalW = 0;

        for (int i = 0; i < len; i++) {
            int p = points.get(i);
            int w = weights.get(i);

            totalWP += p * w;
            totalW += w;
        }

        BigDecimal wm = new BigDecimal((totalWP/totalW)).setScale(1, RoundingMode.HALF_UP);
        System.out.println(wm);

    }
}
