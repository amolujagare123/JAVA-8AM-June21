package StaticFinalDemo;

public class FinalDemo {

    /*final*/ int speed = 100;
    void change()
    {
        speed =200;
    }

    public static void main(String[] args) {

        FinalDemo ob = new FinalDemo();

        System.out.println(ob.speed); // 100
        ob.change();
        System.out.println(ob.speed); // 200

    }
}
