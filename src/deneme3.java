public class deneme3 {

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        String a;
        System.out.println("cümle giriniz :");
        a = kb.nextLine();
        System.out.println("harf sayısı :"+ a.length());

        int sayac = 0;

        for(int i = 0; i < a.length();
            sayac++)
            if(a.charAt(i) == ' ') sayac++;
        System.out.println("kelime sayısı = " + sayac+ 1);



    }

}


