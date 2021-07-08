package WrapperClasses;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        String str1 ="10";
        String str2 ="20";
        System.out.println(str1+str2);

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);
        System.out.println(i1+i2);

        String str3 ="10.1";
        String str4 ="20.2";
        System.out.println(str3+str4);

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);
        System.out.println(d1+d2);


        String str = "false";

        boolean b = Boolean.parseBoolean(str);

        if(b)
            System.out.println("it is true");
        else
            System.out.println("it is false");

        String strChar = "u";

        char ch = strChar.charAt(0);
        System.out.println("ch="+ch);

    }

}
