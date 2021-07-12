package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoString {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        System.out.println(al.isEmpty()); // true

        al.add("amol"); // 0
        al.add("rahul"); // 1
        al.add("Prachi"); //2
        al.add("Kavya"); // 3
        al.add("Santosh"); // 4
        al.add("Anuroop"); // 5
        System.out.println(al.isEmpty()); //false

        System.out.println("Size="+al.size());

        System.out.println(al);

        System.out.println("Using a for loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using a for each loop");
        for(String str : al)
        {
            System.out.println(str);
        }


        System.out.println("Using Iterator");
        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        al.clear();
        System.out.println(al);
        System.out.println(al.isEmpty());
    }
}
