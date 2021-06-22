package ClassAndConstructor;

public class ConstructorDemo {
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

    ConstructorDemo()
    {
        a = 1;
        d =1.1;
        c= 'a';
        str="aaaa";
    }

    public static void main(String[] args) {

        ConstructorDemo ob1 = new ConstructorDemo();
        ob1.display();

        ConstructorDemo ob2 = new ConstructorDemo();
        ob2.display();


    }


}
