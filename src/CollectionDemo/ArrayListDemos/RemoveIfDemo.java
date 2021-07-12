package CollectionDemo.ArrayListDemos;

import java.util.ArrayList;

public class RemoveIfDemo {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(89);
        al.add(18);
        al.add(83);
        al.add(59);
        al.add(42);
        al.add(39);

        System.out.println(al);
        // remove all even number elements

        al.removeIf(a -> a%2 == 0);

        System.out.println(al);

        ArrayList<Character> al1 = new ArrayList<>();
        al1.add('a');
        al1.add('b');
        al1.add('c');
        al1.add('d');
        al1.add('e');
        al1.add('f');
        al1.add('g');
        al1.add('h');
        al1.add('i');
        al1.add('j');
        al1.add('k');
        al1.add('l');
        al1.add('m');
        al1.add('n');
        al1.add('o');

        // remove all vowel - a,e,i,o,u
        System.out.println(al1);


        al1.removeIf(ch -> (ch=='a' || ch=='e' || ch=='i'||ch =='o'||ch=='u'));

        System.out.println(al1);


    }
}
