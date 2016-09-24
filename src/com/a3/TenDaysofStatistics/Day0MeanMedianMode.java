package com.a3.TenDaysofStatistics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by AbdulR3hman on 24/09/2016.
 */
public class Day0MeanMedianMode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        double total = 0d;

        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < arrayLength; i++) {
            int in = sc.nextInt();
            lst.add(in);
            total += in;
        }

        Collections.sort(lst);

        //Calc the mean
        Double mean = total / arrayLength;
        BigDecimal m = new BigDecimal(mean).setScale(1, RoundingMode.HALF_UP);

        //Calc the median
        Double median = 0.0;
        int middle = (arrayLength / 2);
        if (arrayLength % 2 != 0) {
            median = (double) lst.get(middle);
        } else {
            median = (double) (lst.get(middle - 1) + lst.get(middle));
            median /= 2.0;
        }
        BigDecimal m2 = new BigDecimal(median).setScale(1, RoundingMode.HALF_UP);

        //Calc the Mode
        int maxCounter = 0, maxValue = Integer.MAX_VALUE;
        for (int i = 0; i < lst.size(); i++) {
            int value = lst.get(i);
            int counter = 1;
            //lst.remove(i);
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(j) == value) {
                    counter++;
                }
            }
            if (counter >= maxCounter) {
                if (counter == maxCounter) {
                    if (value < maxValue) {
                        maxCounter = counter;
                        maxValue = value;
                    }
                } else {
                    maxCounter = counter;
                    maxValue = value;
                }
            }
        }
        System.out.println(m);
        System.out.println(m2);
        System.out.println(maxValue);

    }
}
