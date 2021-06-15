package ArraysDemos;

public class TwoDDemo {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] =34;
        a[0][1] =31;
        a[0][2] =30;

        a[1][0] =14;
        a[1][1] =36;
        a[1][2] =24;

        a[2][0] =54;
        a[2][1] =35;
        a[2][2] =37;

        a[3][0] =14;
        a[3][1] =31;
        a[3][2] =24;

        for(int i = 0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
