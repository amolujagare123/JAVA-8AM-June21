package InheritanceDemo;

public class SuperDemo {

    int a =10 ;
    double d;

    SuperDemo()
    {
        System.out.println("inside parent empty constructor");
    }

    SuperDemo(int x , double d1)
    {
        a =x;
        d = d1;
        System.out.println("inside parent parameterized constructor");
    }

    void  demoMethod()
    {
        System.out.println("parent demo method");
    }

}

class  ChildSuper extends SuperDemo
{
    int a = 12;

    ChildSuper()
    {
       // super();
        System.out.println("child class constructor");
        a = 22;
    }

    void  demoMethod()
    {
        System.out.println("child demo method");
    }
    void display()
    {
        demoMethod();
        super.demoMethod();
        System.out.println(super.a);
        System.out.println(a);
    }

    public static void main(String[] args) {

        ChildSuper ob = new ChildSuper();
     /*   ob.display();
        System.out.println(ob.a);*/


    }
}
