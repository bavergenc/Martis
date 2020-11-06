public class enbuyuk1 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int sayi1;
        int sayi2;

        System.out.println("sayı1 :");
        sayi1 = kb.nextInt();
        System.out.println("sayı2 :");
        sayi2 = kb.nextInt();

        if(sayi1 < sayi2) {
            System.out.println("sayı1 < sayı2");

        }
        if(sayi1 > sayi2) {
            System.out.println("sayı 1 > sayı2");
        }

    }
}



