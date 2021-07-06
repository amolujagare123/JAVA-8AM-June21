package AbstractionDemos;

public abstract class AbstractclassDemo {

    abstract void run(); // abstract  - declared
    /* public  */abstract  void start();

    void myMethod() // non abstract method - defined
    {
        System.out.println("myMethod");
    }

    /*public static void main(String[] args) {
        AbstractclassDemo ob = new AbstractclassDemo();
    }*/
}

class ChildAbstract extends AbstractclassDemo
{
     void run()
    {
        System.out.println("run");
    }

    void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractclassDemo ob = new ChildAbstract();
      //  AbstractclassDemo ob1 = new  AbstractclassDemo(); // not allowed

        ob.run();
        ob.start();
        ob.myMethod();

    }


}
