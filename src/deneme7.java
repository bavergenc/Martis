public class deneme7 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;

        System.out.println("n'yi giriniz :");
        n = kb.nextInt();

        if(n % 2 == 0)
            n--;

        for (int i = 1; i < n; i = i + 2) {
            for (int j = 0; j < (n - i)/2; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = n; i >= 1; i = i - 2) {
            for (int k = 1; k <= (n - i)/2; k++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }

    }
}
