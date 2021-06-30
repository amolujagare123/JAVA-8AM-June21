package InheritanceDemo;

public class OverloadingDemo {
    int a ;
    int b;

    void addition()
    {
        int c;
        c= a+b;
        System.out.println("c="+c);
    }
    void addition(int x)
    {
        int c;
        c= a+x;
        System.out.println("c="+c);
    }

    void addition(int x, int y)
    {
        int c;
        c= y+x;
        System.out.println("c="+c);
    }

    void addition(double x, double y)
    {
        double c;
        c= y+x;
        System.out.println("c="+c);
    }

    void addition(double x, int y, char ch , String s)
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("ch="+ch);
        System.out.println("s="+s);
    }

    public static void main(String[] args) {
        OverloadingDemo ob = new OverloadingDemo();

        ob.addition();
        ob.addition(23);
        ob.addition(23,11);
        ob.addition(1.1,2.2);
        ob.addition(2.2,23,'g',"kjkjk");
    }
}
