package CollectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("amol");
        ll.add("anuroop");
        ll.add("asha");
        ll.add("mayur");
        ll.add("prachi");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }

}
