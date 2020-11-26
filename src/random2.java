import java.util.Random;

public class random2 {

        public static void main(String[] args) {
            int[] a ={1,2,3,4,5,6,7,8,9,10};
            String[] b ={"can","klavye", "bilgisayar","şişe","su","masa","telefon","kablo","kitap","sigara"};
            int i;
            Random rand = new Random();


            for( i = 0; i < a.length;i++) {
                if (a[i] % 2 == 0)
                    System.out.println("çift" + a[i]);
            }

            i = rand.nextInt(a.length);
            System.out.println("" + b[i]);

        }
}
