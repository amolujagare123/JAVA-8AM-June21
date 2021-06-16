package ArraysDemos;

public class TwoDDemo3 {

    public static void main(String[] args) {

        String[][] aa = {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},
                {"abc5","pqr5","xyz5"}

        };

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
