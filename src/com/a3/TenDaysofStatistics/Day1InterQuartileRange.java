package com.a3.TenDaysofStatistics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by alab on 29/09/2016.
 */
public class Day1InterQuartileRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>();

        for (int i = 0; i < len; i++)
            x.add(sc.nextInt());
        for (int i = 0; i < len; i++)
            y.add(sc.nextInt());
        for (int i = 0; i < len; i++)
        {
            int innerLoop = y.get(i);
            for (int j = 0; j < innerLoop; j++)
                z.add(x.get(i));
        }

        Collections.sort(z);
        double Q1 = getMedain(split(z,false));
        double Q3 = getMedain(split(z,true));

        BigDecimal Q = new BigDecimal(Q3 - Q1).setScale(1, RoundingMode.HALF_UP);
        System.out.println(Q);
    }

    public static double getMedain(ArrayList<Integer> arr) {
        int len;
        int med;
        int mid;
        double r;
        boolean isOdd;

        len = arr.size();
        isOdd = (len % 2 == 0) ? false : true;
        mid = len / 2;

        if (isOdd)
            r = arr.get(mid);
        else
            r = (arr.get(mid) + arr.get(mid - 1)) / 2;

        return r;
    }
    /**
    * Spliting an array half way, if an odd array, do not return the middle element. 
    * Not this is not a fair split.
    **/
    public static ArrayList<Integer> split(ArrayList<Integer> parent, boolean up) {

        ArrayList<Integer> child = new ArrayList<>();
        boolean isOdd = (parent.size() % 2 == 0) ? false : true;

        if (up) {
            int middle = (!isOdd) ? parent.size() / 2 : parent.size() / 2 + 1;
            for (int i = middle; i < parent.size(); i++)
                child.add(parent.get(i));
        } else {
            for (int i = 0; i < parent.size() / 2; i++)
                child.add(parent.get(i));
        }

        Collections.sort(child);
        return child;

    }
}
