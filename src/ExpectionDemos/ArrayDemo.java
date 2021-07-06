package ExpectionDemos;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[3];

        try {
            a[0] = 12;
            a[1] = 12;
            a[2] = 12;
            a[3] = 12;
        }
        catch (Exception e)
        {
            System.out.println("inside catch block");
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("end of the program");
    }
}
