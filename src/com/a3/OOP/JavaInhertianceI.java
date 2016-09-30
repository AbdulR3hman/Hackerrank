package com.a3.OOP;

/**
 * Created by alab [AKA AbdulRehman Al-Faraj] on 30/09/2016.
 * Company: Barings
 */
public class JavaInhertianceI {

    class Animal{
        void walk(){
            System.out.println("I am walking");
        }
    }

    class Bird extends Animal
    {
        void fly()
        {
            System.out.println("I am flying");
        }

        //Solution is here:
        void sing()
        {
            System.out.println("I am singing");
        }
    }


}
