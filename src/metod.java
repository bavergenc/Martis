public class metod {
    public static void carpma(int sayi7 , int sayi8){
        System.out.println(" çarpımları :" + sayi7 * sayi8);
    }

    public static void bolme(double sayi5 , double sayi6){
        System.out.println("bölümleri :" + sayi5 / sayi6);
    }

    public static void cikarma(int sayi3 , int sayi4){
        System.out.println("çıkarma : " + (sayi3 - sayi4));
    }

    public static void toplama(int sayi1 , int sayi2){
        System.out.println("toplamaları  : " + (sayi1 + sayi2));
    }

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int a;
        int b;

        System.out.println("bir sayı giriniz :");
        a = kb.nextInt();
        System.out.println("bir sayı giriniz :");
        b = kb.nextInt();

        toplama(a,b);
        cikarma(a,b);
        bolme(a,b);
        carpma(a,b);
    }

}


