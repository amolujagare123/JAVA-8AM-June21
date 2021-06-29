package pack2;

import StaticFinalDemo.StaticMethodDemo;
import pack1.Java1;

import static StaticFinalDemo.StaticMethodDemo.method2;
import static StaticFinalDemo.StaticMethodDemo.myMethod;
import static StaticFinalDemo.StaticMethodDemo.college;
//import static  StaticFinalDemo.StaticMethodDemo.*;

public class Java3 extends  Java1 {

    int a3;
    double d3;
    char c3;
    String str3 ;

    void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

       // ob.a1 = 10;
        ob.d1 =2.2;
       // ob.str1 = "amol";

        Java3 ob2 = new Java3();
        ob2.str1 = "amol";
      //  ob2.a1 =10 ;
        ob2.d1 = 45;


     /*   ob.c1 = 'g';
        ob.str1 = "amol";
        ob.display1();*/

       /* StaticMethodDemo.method2();
        StaticMethodDemo.myMethod();
        StaticMethodDemo.college="xyz";*/

        method2();
        myMethod();
        college="xyz";
    }
}
