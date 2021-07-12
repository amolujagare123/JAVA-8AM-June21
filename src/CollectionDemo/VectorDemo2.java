package CollectionDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>(); // default initial capacity -- 10
        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("Size="+v.size()); // 0

        v.add("amol");
        v.add("anuroop");
        v.add("asha");
        v.add("mayur");
        v.add("prachi");
        v.add("amol");
        v.add("anuroop");
        v.add("asha");
        v.add("mayur");
        v.add("prachi");
        v.add("prachi");

        System.out.println("Capacity="+v.capacity()); // 20
        System.out.println("Size="+v.size()); //11

        System.out.println(v);

    }
}
