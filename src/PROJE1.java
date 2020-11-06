import java.util.Random;

public class PROJE1 {
    static int basarili = 0;
    static int basarisiz = 0;

    public static void olasilik() {
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

        while (true)

            try {
                {
                    if (m[x + 1][y] == 1) {
                        x++;
                        sayac++;
                    } else if (m[x][y + 1] == 1) {
                        y++;
                        sayac++;
                    } else if (m[x + 1][y + 1] == 1) {
                        x++;
                        y++;
                        sayac++;
                    } else {
                        System.out.println(sayac);
                        basarisiz++;
                        break;
                    }
                }
            } catch (Exception e) {
                basarili++;
                System.out.println("X : kordinatı : " + x);
                System.out.println("Y : kordinatı :" + y);
                System.out.println("adım sayısı : " + sayac);

                break;
            }
    }

    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            olasilik();
        }
        System.out.println(" % " + basarili + " başarılı");
        System.out.println(" % " + basarisiz + " başarılı");

    }

}

