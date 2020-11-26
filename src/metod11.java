public class metod11 {
    static int sayi1 = 0;
    static int sayi2 = 0;
    static int sayi3 = 0;

    public static void enbuyuk(){
        java.util.Scanner kb = new java.util.Scanner(System.in);


        System.out.println("bir sayı giriniz :");
        sayi1 = kb.nextInt();
        System.out.println("bir sayı girinix :");
        sayi2 = kb.nextInt();
        System.out.println("bir sayı giriniz :");
        sayi3 = kb.nextInt();

        if(sayi1 > sayi2){
            if(sayi1 > sayi3)
                System.out.println("en büyük sayı :" + sayi1);
        }

        if(sayi2 > sayi1){
            if(sayi2 > sayi3)
                System.out.println("en büyük sayı : " + sayi2);
        }

        if(sayi3 > sayi2){
            if(sayi3 > sayi1)
                System.out.println("en büyük sayı :" + sayi3);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        enbuyuk();
        if(sayi1 < sayi2){
            if(sayi1 < sayi3)
                System.out.println("en küçük sayı " + sayi1);
        }
        if(sayi2 < sayi1){
            if (sayi2 < sayi3)
                System.out.println("en küçük sayı " + sayi2);
        }

        if(sayi3 < sayi2){
            if(sayi3 < sayi1)
                System.out.println("en küçük sayı " + sayi3);
        }
    }
}

