package com.a3.ExceptionHandling;

/**
 * Created by alab [AKA AbdulRehman Al-Faraj] on 30/09/2016.
 * Company: Barings
 */
class MyCalculator {
    public static int power(int n, int p) throws Exception
    {
        if ( n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        return ((int) Math.pow(n, p));
    }
}
