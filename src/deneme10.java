public class deneme10 {
    public static void main(String[] args) {
        int a[] = {5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i , size , n, flag;
        size  = 20;

        System.out.println("bir sayı giriniz :");
        n = kb.nextInt();

        flag = 0;
        for ( i = 0; i < n; i++)
            if(a[n] == a[i])
                flag = 1;

        if( flag == 1)
            System.out.println("var");
        else
            System.out.println("yok");


    }

}


