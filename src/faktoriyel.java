public class faktoriyel {

        public static void main(String[] args) {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            int n , i ;
            int faktorıyel = 1;

            System.out.println("n'yi giriniz");
            n = kb.nextInt();

            for ( i = 1; i <= n ; i++) {
                faktorıyel = faktorıyel * i;

            }
            System.out.println( faktorıyel+"!");

        }

    }


