public class ortalamahesaplama {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int not1, not2, not3;
        int ortalama = 0;


        System.out.println("1.notu giriniz :");
        not1 = kb.nextInt();
        System.out.println("2.notu giriniz :");
        not2 = kb.nextInt();
        System.out.println("3.notu giriniz:");
        not3 = kb.nextInt();

        ortalama = (not1 + not2 + not3) / 3;

        System.out.println("ortalamanız :"+ortalama);

        if (ortalama < 40)
            System.out.println("FF");

        if(ortalama > 40 && ortalama < 50)
            System.out.println("CC");

        if (ortalama > 60 && ortalama < 80)
            System.out.println("BB");

        else if (ortalama > 80 && ortalama < 100)
            System.out.println("AA");


    }
}


