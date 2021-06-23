package ClassAndConstructor;

public class ParameterizedConstructorThis {
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

    ParameterizedConstructorThis(int a, double d, char c , String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    public static void main(String[] args) {

        ParameterizedConstructorThis ob1 =
                new ParameterizedConstructorThis(2,2.2,'d',"bbb");
        ob1.display();




    }


}
