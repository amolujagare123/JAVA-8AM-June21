package ClassAndConstructor;

public class ParameterizedConstructorDemo {
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

    ParameterizedConstructorDemo(int a1,double d1,char c1 , String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }

    public static void main(String[] args) {

        ParameterizedConstructorDemo ob1 = new ParameterizedConstructorDemo(2,2.2,'d',"bbb");
        ob1.display();




    }


}
