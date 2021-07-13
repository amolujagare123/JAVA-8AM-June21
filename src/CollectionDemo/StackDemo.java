package CollectionDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

       Stack<String> s = new Stack<>();
        System.out.println(s.empty()); // true

        s.push("amol");
        s.push("anuroop");
        s.push("asha");
        s.push("mayur");
        s.push("prachi");
        s.push("saileja");
        s.push("Kavya");
        System.out.println(s.empty()); // false
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println( s.peek());
        System.out.println(s);

    }
}
