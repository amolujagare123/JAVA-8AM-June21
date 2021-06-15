package ArraysDemos;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {34,21,21,1,1,45,21,3,122};

        System.out.println("length="+a.length);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");


        double[] d = {2.3,5.3,3.2,3.55,56.11,66.1,9.0};
        System.out.println();

        for (int i=0;i<d.length;i++)
            System.out.print(d[i]+" ");

        char[] c = {'g','h',',',':','['};
        System.out.println();

        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");

        String[] ss  = {"amol","prachi","vinay","anuroop","prashant","Anand"};
        System.out.println();
        for (int i=0;i<ss.length;i++)
            System.out.println(ss[i]);

    }
}
