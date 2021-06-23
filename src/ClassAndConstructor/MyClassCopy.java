package ClassAndConstructor;

public class MyClassCopy {
    int a;
    double d;
    char c;
    String str ; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    MyClassCopy()
    {

    }

    MyClassCopy(MyClassCopy obj)
    {
        a = obj.a;
        d = obj.d;
        c = obj.c;
        str = obj.str;
    }

    public static void main(String[] args) {

        MyClassCopy ob1 = new MyClassCopy();
        ob1.a = 10 ;
        ob1.d = 1.2;
        ob1.c = 'g';
        ob1.str ="amol";
        ob1.display();

        MyClassCopy obCopy = new MyClassCopy(ob1);
        obCopy.display();

        MyClassCopy obCopy1 = new MyClassCopy(ob1);
        obCopy1.display();

    }

}
