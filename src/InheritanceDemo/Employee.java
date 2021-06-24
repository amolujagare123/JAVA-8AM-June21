package InheritanceDemo;

public class Employee {

    int salary = 30000;

    void myJob()
    {
        System.out.println("work");

    }

}

class  Programmer extends Employee
{
    int bonus = 5000;

    void additionWork()
    {
        System.out.println("Coding");
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.additionWork();

        System.out.println(p.salary);
        p.myJob();
    }

}
