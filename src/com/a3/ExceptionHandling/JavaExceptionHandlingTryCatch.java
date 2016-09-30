package com.a3.ExceptionHandling;
import java.util.Scanner;

/**
 * Created by alab [AKA AbdulRehman Al-Faraj] on 30/09/2016.
 * Company: Barings
 */
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x/y);
        }catch (java.util.InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
