public class while3 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n,digit;

        System.out.println("bir sayı giriniz :");
        n = kb.nextInt();

        while (n != 0){
            digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }

        for (int i = 1; i < 4; i++) {

            int m[] = new int[10];
            System.out.println(m[n]);
        }
    }
}

