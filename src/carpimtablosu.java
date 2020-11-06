public class carpimtablosu {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int n;

        System.out.println("bir sayı giriniz :");
        n = kb.nextInt();

        for (int i = 0; i <= 10; i++)
            for (int k = 0; k <= 10; k++) {
                System.out.println("1.sayı :" + i);
                System.out.println(k * n);
            }


    }

}

