public class yildiz {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, k, n;

        System.out.println("n'yi giriniz :");
        n = kb.nextInt();


        for (i = n; i >= 1; i = i - 1) {
            for (k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }

    }
}

