public class PROJE1 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int n;
        System.out.println("bir sayı giriniz :");
       n = kb.nextInt();

        for (int i = 0; i < n; i = i + 2) {
            for (int j = 0; j < (n-i)/2; j++)
                System.out.print(" ");
            for (int a = 0; a < i; a++)
                System.out.print("*");
            System.out.println();
    }
}
}