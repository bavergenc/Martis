public class digdötgeninçevresi {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a = 1;
        int b = 2;
        int c, d;
        int e = 0;
        System.out.println("dikdörgen ise 1 kare ise 2 yi tuşlayınız ");
        a = kb.nextInt();
        if (a== 1) {
            System.out.println("uzun kenar");
            c = kb.nextInt();
            System.out.println("kısa kenar");
            d = kb.nextInt();
            e = c * d;
            System.out.println("dikdörgenin alanı :" + e);
        }
        else if(a == 2)
            System.out.println("kenar uzunluğunu giriniz :");
        c = kb.nextInt();
        e = c + c + c + c;
        System.out.println("karenin alanı :" + e);

    }
}
