package ArraysDemos;

public class ArrayDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5]; // int

        a[0] = 11;
        a[1] = 31;
        a[2] = 19;
        a[3] = 91;
        a[4] = 18;

        System.out.println("elements in the array="+a.length);// 5
       // System.out.println(a[2]);

        for(int i=0;i< a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
