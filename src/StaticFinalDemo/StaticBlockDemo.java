package StaticFinalDemo;

public class StaticBlockDemo {


    static {
        System.out.println("inside static");
    }

    {
        System.out.println("non static ");
    }

   public static void main(String[] args) {
        System.out.println("inside main method");
    }
}
