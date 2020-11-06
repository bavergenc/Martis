public class deneme5 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int sayı1 , sayı2 , a;
        a = 1;
        System.out.println("sayı1 yazınız :");
        sayı1 = kb.nextInt();

        System.out.println("sayı2 yazınız :");
        sayı2 = kb.nextInt();

        for (int i = 1; i <= sayı2 ; i++) {
            a = a * sayı1;

        }
        System.out.println(a);
    }
}
