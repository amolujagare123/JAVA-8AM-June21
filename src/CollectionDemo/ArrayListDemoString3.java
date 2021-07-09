package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemoString3 {

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

        al1.add("abc1");
        al1.add("abc2");
        al1.add("abc3");
        al1.add("abc4");
        al1.add("Prachi");
        al1.add("Kavya");
        al1.add("Santosh");

        System.out.println("al1="+al1);

        al1.removeAll(al);

        System.out.println("al1="+al1);


    }
}
