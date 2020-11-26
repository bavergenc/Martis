import java.util.Random;

public class matris2 {

        public static void main(String[] args) {
            int[] a ={0,0,0,0,0,0,0,0,0,0};
            int[][] m = new int[5][5];
            int row , col;
            row = 5;
            col = 5;

            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {


                    int sayi = random.nextInt(3);
                    m[i][j] = sayi;
                }
            }
            for (int x = 0; x < 5; x++) {
                for (int y = 0; y < 5; y++) {
                    System.out.print(" "+ m[x][y]);
                    a[m[x][y]] = a[m[x][y]] + 1;


                }
                System.out.println();
            }
            for (int j = 0; j < 9; j++) {
                System.out.println(j + " " + a[j]);
            }

        }
    }


