package pack1;

public class Java2 {

    public int a2; // 0
    public double d2; // 0.0
    public char c2;  //
    public String str2 ;// null

    public void display2()
    {
        System.out.println("a="+a2);
        System.out.println("d="+d2);
        System.out.println("c="+c2);
        System.out.println("str="+str2);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a1 = 10;
        ob.d1 =2.2;
       // ob.c1 = 'g';
        ob.str1 = "amol";
        ob.display1();


    }
}
