package ControlStructure;

public class SwitchCasedemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 2 ;
        int result = 0;

        String operation = "mult";

        switch (operation)
        {
            case "add" : result = a + b ;
                System.out.println("Result="+result);
                break;

            case "sub" : result = a - b ;
                System.out.println("Result="+result);
                break;

            case "div" : result = a / b ;
                System.out.println("Result="+result);
                break;

            case "mult" : result = a * b ;
                System.out.println("Result="+result);
                break;

            default:
                System.out.println("Wrong choice");
                break;

        }



    }

}
