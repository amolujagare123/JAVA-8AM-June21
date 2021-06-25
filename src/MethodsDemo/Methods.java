package MethodsDemo;

import pack1.Java2;

import java.util.Date;

public class Methods {


    void myMethod()
    {
        System.out.println("My method");
    }

    void myMethod2(int x)
    {
        System.out.println("x="+x);
    }

    void myMethod3(int x,int y)
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
    }

    void myMethodDouble(double d)
    {
        System.out.println("d="+d);
    }

    void myMethodString(String str)
    {
        System.out.println("str="+str);
    }

    void myArrayArgument(int[] a)
    {
        System.out.println("Below is array");

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println();
    }

    void myClassObject(Java2 obj)
    {
        obj.a2 = 2;
        obj.d2 = 2.2;
        obj.c2 = 'c';
        obj.str2 = "amol";
    }


    void myTwoDArray(String[][] stArr)
    {
        System.out.println("Below is 2D array");
        for(int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }
    }



    void myMethodDate(Date date)
    {
        System.out.println("date="+date);
    }


    public static void main(String[] args) {

        Methods ob = new Methods();

        /*ob.myMethod();

        ob.myMethod2(101);

        ob.myMethod3(101,202);

        ob.myMethodDouble(4.5);

        ob.myMethodString("hfjhfjdhjf");
        ob.myMethodDate(new Date());


        int[] x = {34,12,4,5,12,12,21};
        int[] y = {34,12,4,5,12,12,21,11,22,111,23,111,66,77,1};

        ob.myArrayArgument(x);
        ob.myArrayArgument(y);


        String[][] ss = {
                {"abc1","pqr1","xyz1"} ,
                {"abc2","pqr2","xyz2"} ,
                {"abc3","pqr3","xyz3"} ,
                {"abc4","pqr4","xyz4"} ,
        };

        ob.myTwoDArray(ss);*/

        Java2 j2 = new Java2();

        ob.myClassObject(j2);

        j2.display2();

    }
}
