package ClassAndConstructor;

public class AnotherClass {
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

   // default constructor

    public static void main(String[] args) {

        AnotherClass ob1 = new AnotherClass();

       /* ob1.a = 10 ;
        ob1.d = 1.2;
        ob1.c = 'g';
        ob1.str ="amol";*/

        ob1.display();


    }


}
