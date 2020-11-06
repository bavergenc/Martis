public class enbuyuk {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int sayi1;
        int sayi2;
        int sayi3;

        System.out.println("sayı1 :");
        sayi1 = kb.nextInt();
        System.out.println("sayı2 :");
        sayi2 = kb.nextInt();
        System.out.println("sayı3 :");
        sayi3 = kb.nextInt();

        int enbuyuk = sayi1;

        if(sayi2 > enbuyuk) {
            enbuyuk = sayi2;
        }
        if(sayi3 > enbuyuk) {
            enbuyuk = sayi3;
        }

        int enkucuk = sayi1;

        if( sayi2 < enkucuk){
            enkucuk = sayi2;
        }

        if(sayi3 < enkucuk) {
            enkucuk = sayi3;
        }
        System.out.println("en büyük  sayı :"+ enbuyuk);
        System.out.println("en küçük sayı :" + enkucuk);

    }
}


