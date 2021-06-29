package StaticFinalDemo;

public class StaticMethodDemo {

    int rno;
    String name;
    public static String college;

    void display() // non static method
    {
        System.out.println("rno="+rno);// non static member is allowed
        System.out.println("name="+name);// non static member is allowed
        System.out.println("college="+college); // static member is allowed
        method2(); // static member is allowed
        method3();// non static member is allowed

    }

    void method3()
    {
        System.out.println("another non static method");
    }


    public static void method2()
    {
        System.out.println("another static method");
    }

   public static void myMethod() // static method
    {
        System.out.println("inside static my method");
        System.out.println(college);// static members are allowed
       // System.out.println(rno); // non static members are not allowed
      //  display(); // non static members are not allowed
        method2();// static members are allowed
    }

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();

        ob.method2();
        StaticMethodDemo.method2();
        //Static method can be called using class name

    }
}
