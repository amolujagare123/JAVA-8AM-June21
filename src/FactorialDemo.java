public class FactorialDemo {

    public static void main(String[] args) {

        int num =5;
        int mult =1;

        for(num=5; num>=1 ; num-- )
        {
            mult = mult * num;
        }

        System.out.println("Factorial="+mult);
    }
}
