package MethodsDemo;

public class ReturnValue {

    int getMyInt()
    {

        int a = 89;

      //  return 10;
        return  a;
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
    }
}
