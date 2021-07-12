package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoString4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("amol"); // 0
        al.add("rahul"); // 1
        al.add("Prachi"); //2
        al.add("Kavya"); // 3
        al.add("Santosh"); // 4
        al.add("Anuroop"); // 5

        System.out.println("al="+al);

        //String str = "amol"; // str.startsWith("A")

        // remove elements that starts with A
        // remove elements contains 'o'
        // remove elements with size 5
        // predicate symbol : ->

       // al.removeIf(str -> str.startsWith("A") || str.startsWith("a"));
       // al.removeIf(str -> str.contains("o"));
        al.removeIf(str -> str.length()==5);

        System.out.println("al="+al);




    }
}
