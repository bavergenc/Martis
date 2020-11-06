public class matris4 {
    public static void main(String[] args) {
        int[][] m ={{5 , 7 ,3},
                {15, 6 , 3},
                {22, 9 , 1},
                {11, 14 , 18}};

        int i , k , row , col , max;
        row = 4;
        col = 3;

        max = m[0][0];

        for ( i = 0; i <row ; i++) {
            max = m[i][0];
            for (k = 0; k <col ; k++)
                if(m[i][k] > max)
                    max = m[i][k];
            System.out.println(i + "nolu satırın en büyüğü "+max);
        }


    }
}

