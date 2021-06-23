package pack1;

public class Java1 {

     int a1;
    public double d1;
    private char c1;
    protected String str1 ; // lets access this member in Java3 (outside package)

    void display1()
    {
        System.out.println("a="+a1);
        System.out.println("d="+d1);
        System.out.println("c="+c1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args) {


        Java1 ob = new Java1();
        ob.a1 = 10;
        ob.d1 =2.2;
        ob.c1 = 'g';
        ob.str1 = "amol";
        ob.display1();
    }
}
