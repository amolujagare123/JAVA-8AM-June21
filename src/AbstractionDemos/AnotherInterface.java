package AbstractionDemos;

public interface AnotherInterface {

    void start();
    void run();

    void display();
}

interface Interface2
{
    void display();
}

class ChildInterface2 implements AnotherInterface,Interface2
{
    public void run()
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }

    public  void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {
        ChildInterface2 ob = new ChildInterface2();
        ob.display();

        AnotherInterface ob1 =  new ChildInterface2();
        ob1.display();

        Interface2 ob2 =  new ChildInterface2();
        ob2.display();
    }

}
