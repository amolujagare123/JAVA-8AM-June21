package InheritanceDemo;

public class Animal1
{
    void eat()
    {
        System.out.println("eat");
    }
}

class  Cat extends Animal1
{
    void meow()
    {
        System.out.println("meow");
    }
}

class  Tiger extends Animal1 {
    void roar()
    {
        System.out.println("roar");
    }
}

class TestInheritance1
{
    public static void main(String[] args) {

        Animal1 animal1 = new Animal1();
        animal1.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();

        Tiger tiger = new Tiger();
        tiger.roar();
        tiger.eat();
    }
}
