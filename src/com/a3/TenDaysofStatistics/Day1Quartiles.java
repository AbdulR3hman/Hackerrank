package com.a3.TenDaysofStatistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by AbdulR3hman on 24/09/2016.
 */
public class Day1Quartiles {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int len = sc.nextInt();

            ArrayList<Integer> x = new ArrayList<>();

            for (int i = 0; i < len; i++)
                x.add(sc.nextInt());

            //Sort Alpha
            Collections.sort(x);
            ArrayList<Integer> a = split(x, false);
            ArrayList<Integer> b = split(x, true);

            System.out.println(getMedain(a));
            System.out.println(getMedain(x));
            System.out.println(getMedain(b));


        }

        public static Integer getMedain(ArrayList<Integer> arr) {
            int len;
            int med;
            int mid;
            boolean isOdd;

            len = arr.size();
            isOdd = (len % 2 == 0) ? false : true;
            mid = len / 2;

            if (isOdd)
                med = arr.get(mid);
            else
                med = (arr.get(mid) + arr.get(mid - 1)) / 2;

            return med;
        }

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
