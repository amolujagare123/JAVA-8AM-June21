package InheritanceDemo;

public  class ClassA {
    int x;

    void myMethod()
    {
        System.out.println("Parent method");
    }

}

class ClassB extends ClassA
{
    int y;

   void myMethod()
    {
        System.out.println("Child method");
    }

    public static void main(String[] args) {

        ClassB ob = new ClassB();
        ob.y = 12;
        ob.x =45;
    }
}
