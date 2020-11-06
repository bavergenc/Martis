public class deneme6 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int sayı1;
        int sayac = 0;
        System.out.println("bir tamsayı giriniz :");
        sayı1 = kb.nextInt();

        for (int i = 1; i <= sayı1; i++) {
            int kalan = sayı1%i;
            if(kalan==0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println("sayı asaldır");
        }
        else
            System.out.println("sayı asal değildir");

    }

}
