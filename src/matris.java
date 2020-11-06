import java.util.Random;

public class matris {

        public static void main(String[] args) {

            int m[][] = new int[7][7];

            Random random = new Random();
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    int sayi = random.nextInt(2);
                    m[i][j] = sayi;
                    System.out.print(m[i][j] + " , ");

                }
                System.out.println();
            }

        }
}
