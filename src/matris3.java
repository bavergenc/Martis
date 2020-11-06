public class matris3 {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        int i , k , row , col;
        row = 5;
        col = 5;

        for ( i = 0; i < row ; i++)
            for (k = 0; k < col; k++)
                if (i==k)
                    m[i][k] = 0;
                else
                    m[i][k] =2;
        for (i = 0; i < row; i++) {
            for (k = 0; k < col; k++)

                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}


