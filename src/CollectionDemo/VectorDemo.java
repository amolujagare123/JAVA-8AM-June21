package CollectionDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("anuroop");
        v.add("asha");
        v.add("mayur");
        v.add("prachi");

        System.out.println(v);

        Object[] arr = v.toArray();

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("using iterator");
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("using Enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
