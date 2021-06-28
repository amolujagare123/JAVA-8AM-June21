package MethodsDemo;

import pack1.Java1;
import pack1.Java2;

public class ReturnValue {

    int getMyInt()
    {

        int a = 89;

      //  return 10;
        return  a;
    }

    int[] getMyArray()
    {
        int[] x = {78,323,1,12,34,11};

        return  x;
    }

    String[][] getMyTwoDArray()
    {
        String[][] ss = {
                {"abc1","pqr1","xyz1"} ,
                {"abc2","pqr2","xyz2"} ,
                {"abc3","pqr3","xyz3"} ,
                {"abc4","pqr4","xyz4"} ,
        };

        return  ss;
    }

    Java2 getMyObject()
    {
        Java2 ob = new Java2();
        ob.a2 = 10;
        ob.d2 =2.2;
        ob.c2 = 'g';
        ob.str2 = "amol";

        return ob;
    }


    public static void main(String[] args) {

        int a =10;
        System.out.println(a); // 10
        int x = a ;

        ReturnValue ob = new ReturnValue();

        ob.getMyInt(); // a --> 89

        System.out.println(ob.getMyInt());

        int yy = ob.getMyInt();

        System.out.println("yy="+yy);


        int[] arr = ob.getMyArray();
        System.out.println("Printing array arr");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();

        String[][] stArr = ob.getMyTwoDArray();

        for(int i=0;i<stArr.length;i++)
        {
            for (int j = 0 ; j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }


        Java2 obj = ob.getMyObject();
        obj.display2();

    }
}
