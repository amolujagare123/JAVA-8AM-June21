package InheritanceDemo;

public class ClassA {
    int x;
}

class ClassB extends ClassA
{
    int y;
    public static void main(String[] args) {

        ClassB ob = new ClassB();
        ob.y = 12;
        ob.x =45;
    }
}
