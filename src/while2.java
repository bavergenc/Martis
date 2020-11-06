public class while2 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int sayi;

        System.out.println("bir sayı giriniz :");
        sayi = kb.nextInt();

        while (true) {
            System.out.println("bir sayı giriniz :");
            sayi = kb.nextInt();

            if(sayi <= 0) {
                System.out.println("döngüden çıkılıyor");
                break;
            }
            System.out.println("sayı " + sayi);

        }
    }
}
