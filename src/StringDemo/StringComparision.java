package StringDemo;

public class StringComparision {

    public static void main(String[] args) {

        int a =10;
        int b =10;

        //System.out.println(a==b);

        // int, float, char, double, boolean - premitive data types

        String str1 ="amol";
        String str2 ="amol";
        String str3 ="Amol";
        String str4 ="rahul";
        String str5 ="xyz";

        String str6 =new String("amol");

        System.out.println("Comparing addresses:"+(str1==str2)); // true
        System.out.println("Comparing addresses:"+(str1==str6));



        System.out.println(str6.equals(str1)); // true
        System.out.println(str6.equalsIgnoreCase(str3)); // false
        System.out.println(str6.equals(str4));// false

        //  str1 == str2 // this will compare the addresses of 2 objects
        // str1 and str2 are objects
/*
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equals(str5)); // false
        System.out.println(str5.equals(str4)); // false*/

    }
}
