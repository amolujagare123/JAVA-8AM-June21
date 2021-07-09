package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoString1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("amol"); // 0
        al.add("rahul"); // 1
        al.add("Prachi"); //2
        al.add("Kavya"); // 3
        al.add("Santosh"); // 4
        al.add("Anuroop"); // 5

       /*  System.out.println(al);
            al.remove("Kavya");
              al.remove(4);*/
        System.out.println(al);
        al.set(4,"sanket");
        System.out.println(al);
    }
}
