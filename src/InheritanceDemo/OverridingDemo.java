package InheritanceDemo;

public class OverridingDemo {

    void myMethod()
    {
        System.out.println("parent method");
    }
}

class ChildOverring extends  OverridingDemo {

    void myMethod()
    {
        System.out.println("Child method");
    }

    public static void main(String[] args) {

        ChildOverring ob = new ChildOverring();

        OverridingDemo ov = new ChildOverring(); // upcasting

        ob.myMethod();


    }
}
