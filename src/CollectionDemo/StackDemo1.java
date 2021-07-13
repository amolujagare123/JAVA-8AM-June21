package CollectionDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

       Stack<String> s = new Stack<>();

        s.push("amol"); // 0  | 7
        s.push("anuroop"); // 1 | 6
        s.push("asha"); // 2 | 5
        s.push("mayur"); // 3 | 4
        s.push("prachi"); // 4 | 3
        s.push("saileja"); // 5 | 2
        s.push("Kavya"); //6 | 1

        System.out.println(s);

        System.out.println(s.search("asha1"));
        System.out.println(s.search("amol"));



    }
}
