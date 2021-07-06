package ExpectionDemos;

public class NumberValidation {

    void checkNumber(int i) // 1 to 10
    {
        if(i>=1 && i<=10)
            System.out.println("We are safe");

        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args)  {

        NumberValidation ob = new NumberValidation();

        int a =18;

        ob.checkNumber(a);

        System.out.println("end of the program");

    }
}
