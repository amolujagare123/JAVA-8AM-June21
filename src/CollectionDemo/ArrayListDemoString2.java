package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemoString2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("amol"); // 0
        al.add("rahul"); // 1
        al.add("Prachi"); //2
        al.add("Kavya"); // 3
        al.add("Santosh"); // 4
        al.add("Anuroop"); // 5

        System.out.println("al="+al);

        ArrayList<String> al1 = new ArrayList();

        System.out.println("al1="+al1);
        al1.addAll(al);
        System.out.println("al1="+al1);

    }
}
