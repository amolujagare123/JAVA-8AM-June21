public class Triangle {

    public static void main(String[] args) {
        int a = 180;
        int b = 90;
        int c = -90; // multiple if

        if(a+b+c==180 && a>0 && b>0 && c> 0) {
            if (a == b && b == c)
                System.out.println("Equilateral Triangle");

            if (a != b && b != c && c != a)
                System.out.println("Sclane Triangle");

            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angled Triangle");

            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
                System.out.println("Isosceles Triangle");
        }
        else
            System.out.println("This is not a triangle");
    }
}
