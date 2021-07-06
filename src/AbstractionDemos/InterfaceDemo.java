package AbstractionDemos;

public interface InterfaceDemo {

    void start();
    void run();

    default void display()
    {
        System.out.println("display");
    }

    static void method1()
    {
        System.out.println("display");
    }

}

class  ChildInterface implements  InterfaceDemo
{
    public void run()
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();
        ob.start();
        ob.run();
        ob.display();
       // ob.method1();//not allowed
        InterfaceDemo.method1(); // for static members

    }

}
