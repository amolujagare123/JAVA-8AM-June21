package ArraysDemos;

public class TwoDDemo2 {

    public static void main(String[] args) {

        int[][] aa = {
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4}
        };


       // int i;
        for(int i=0;i<aa.length;i++)
        {
            for (int j=0;j<aa[0].length;j++)
            {
                System.out.print(aa[i][j]+" ");
            }
            System.out.println();
        }


    }
}
