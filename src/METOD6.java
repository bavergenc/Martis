import java.util.Scanner;

public class METOD6 {


        public static void toplamaa(){
            java.util.Scanner kb = new java.util.Scanner(System.in);
            int a , b, c, e;
            e = 0;
            System.out.println("bir sayı giriniz :");
            a = kb.nextInt();
            System.out.println("bir sayı giriniz :");
            b = kb.nextInt();
            System.out.println("bir sayı giriniz :");
            c = kb.nextInt();
            e = a + b + c;
            System.out.println("toplamları "+ e);
        }
        public static void selamlama(String isim) {
            System.out.println(isim);
        }
        public static void toplama() {

            System.out.println("selam");
        }
        public static void faktoriyel(){
            Scanner scanner  = new Scanner(System.in);
            System.out.println("bir sayı giriniz :");
            int sayi = scanner.nextInt();

            int faktoriyel = 1;
            while (sayi > 0){
                faktoriyel *= sayi;
                sayi--;
            }
            System.out.println("faktoriyel : " + faktoriyel);
        }
        public static void main(String[] args) {

            toplama();
            faktoriyel();
            selamlama("murat");
            toplamaa();
        }
    }


