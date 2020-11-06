public class üçgen {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;
        System.out.println("n'yi giriniz :");
        n= kb.nextInt();

        for (int i = 0; i < n; i = i + 2) {
            for (int j = 1; j <= (n-i)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
