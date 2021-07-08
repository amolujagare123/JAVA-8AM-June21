package WrapperClasses;

import AbstractionDemos.InterfaceDemo;

import java.util.ArrayList;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i =5;

        System.out.println("i="+i);

        Integer ii = new Integer(5); // boxing / wrapping
        System.out.println("ii="+ii);

        Integer ii1 = i; // autoboxing / auto wrapping
        System.out.println("ii1="+ii1);

       /* ArrayList al = new ArrayList();
        al.add("amol");
        al.add("raj");
        al.add(12);
        al.add(1.2);
        al.add(true);
        al.add('b'); // hetrogeneous elements are allowed*/


        int a = ii.intValue(); // unboxing / unwrapping
        // covert non primitive into primitive

        int a1 = ii; // auto unboxing / auto unwrapping

        System.out.println("a="+a);
        System.out.println("a1="+a1);






    }
}
