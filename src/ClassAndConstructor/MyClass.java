package ClassAndConstructor;

public class MyClass {
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

    public static void main(String[] args) {

        MyClass ob1 = new MyClass();
        ob1.a = 10 ;
        ob1.d = 1.2;
        ob1.c = 'g';
        ob1.str ="amol";
        ob1.display();

        MyClass ob2 = new MyClass();
        ob2.a = 20;
        ob2.d = 2.4;
        ob2.c='t';
        ob2.str ="java";
        ob2.display();



    }


}
