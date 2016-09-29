package com.a3.TenDaysofStatistics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Created by alab on 29/09/2016.
 */
public class Day1StandardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int total = 0;
        double mean = 0d;
        double totalDist = 0d;

        ArrayList<Double> x = new ArrayList<>();

        //Get the integers and sum them up as well as saving them
        for (int i = 0; i < len; i++) {
            int j = sc.nextInt();
            x.add((double)j);
            total += j;
        }
        //Calc the mean
        mean = total/len;

        //Although not that important, just for good practice.
        Collections.sort(x);

        //Calc squared distance from the mean
        for (int i = 0; i < len; i++)
            totalDist+=(Math.pow(x.get(i) - mean,2));

        BigDecimal STD = new BigDecimal(Math.sqrt(totalDist/(double)len)).setScale(1, RoundingMode.HALF_UP);
        System.out.println(STD);

    }
}
