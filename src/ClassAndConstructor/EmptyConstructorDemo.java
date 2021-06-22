package ClassAndConstructor;

public class EmptyConstructorDemo {
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

    EmptyConstructorDemo()
    {
        // no body

    }

    public static void main(String[] args) {

        EmptyConstructorDemo ob1 = new EmptyConstructorDemo();

       /* ob1.a = 10 ;
        ob1.d = 1.2;
        ob1.c = 'g';
        ob1.str ="amol";*/

        ob1.display();


    }


}
