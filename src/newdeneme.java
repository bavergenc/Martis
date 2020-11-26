import java.util.Random;

public class newdeneme {
    public static void main(String[] args) {
        int[][] m = new int[7][7];
        int sayi = 0;

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                sayi = random.nextInt(2);
                m[i][j] = sayi;
                System.out.print(m[i][j] + " , ");
            }
            System.out.println();
        }

        int x = 0;
        int y = 0;
        int sayac = 0;
        while (true) {
            try {
                if (m[x + 1][y] == 1) {
                    sayac++;
                    x++;
                }

                if (m[x][y + 1] == 1) {
                    sayac++;
                    y++;
                }
                if (m[x + 1][y + 1] == 1) {
                    sayac++;
                    x++;
                    y++;
                } else {
                    System.out.println(sayac);
                    break;
                }

            } catch (Exception e) {
                System.out.println(x);
                System.out.println(y);
                System.out.println(sayac);
                break;
            }
        }
    }
}
