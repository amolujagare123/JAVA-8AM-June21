package InheritanceDemo;

public class Animal2 {

    void iAmAnimal()
    {
        System.out.println("iAmAnimal");
    }
}

class Reptile extends  Animal2
{
    void iAmReptile()
    {
        System.out.println("iAmReptile");
    }

}

class Mamal extends  Animal2
{
    void iAmMaamal()
    {
        System.out.println("iAmMaamal");
    }

}

class Lion extends Mamal
{
    void iAmLion()
    {
        System.out.println("iAmLion");
    }
}

class TestInhritance2
{
    public static void main(String[] args) {

        Animal2 animal2 = new Animal2();
        animal2.iAmAnimal();

        Reptile reptile = new Reptile();
        reptile.iAmReptile();
        reptile.iAmAnimal();

        Mamal mamal = new Mamal();
        mamal.iAmMaamal();
        mamal.iAmAnimal();

        Lion lion = new Lion();
        lion.iAmLion();
        lion.iAmMaamal();
        lion.iAmAnimal();

    }
}