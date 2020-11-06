public class hesapmakinesi {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int toplam = 1, cikarma = 2, carpma = 3, bolme = 4;
        int islem = 0;
        int a, b;

        System.out.println("bir işlem seçiniz : toplama ise 1 , çıkarma ise 2 , çarpma ise 3 , bölme ise 4 ");
        islem = kb.nextInt();

        System.out.println("bir sayı giriniz :");
        a = kb.nextInt();
        System.out.println("bir sayı giriniz :");
        b = kb.nextInt();

        if (islem == 1) {
            islem = a + b;
            System.out.println(" toplam :" +islem);
        } else if (islem == 2) {
            islem = a - b;
            System.out.println("toplam :" + islem);
        } else if (islem == 3) {
            islem = a * b;
            System.out.println("toplam " + islem);
        } else {
            islem = a / b;
            System.out.println("toplam " + islem);
        }
    }

}
