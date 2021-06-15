package loops;

public class IncDecDemo1 {

    public static void main(String[] args) {

        int i =10 ;

        System.out.println(i);  // 10
        System.out.println(i--); // 10
        System.out.println(i);  // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8


      /*  i--  : first statement is executed and
          then decrement happens

       --i : first  decrement happens and
        then statement is executed
*/
    }
}
