package ArraysDemos;

public class ForEachDemo {

    public static void main(String[] args) {

        int[] a = {34,21,21,1,1,45,21,3,122};

        System.out.println("length="+a.length);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        // for each --> when you have sequencial data

        System.out.println("\nUsing for each loop");

        for(int x:a)
        {
            System.out.println(x);
        }

        char[] c = {'g','h',',',':','['};
        System.out.println();
        System.out.println("\nUsing for each loop");

        for(char cc : c)
        {
            System.out.println(cc);
        }
    }
}
