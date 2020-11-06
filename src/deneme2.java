public class deneme2 {
    public static void main(String[] args) {

        int a[]= {4,8,3,1,12,32,11,6,44,7,98};
        int i , k , size;
        size = 10;

        for(i = 0; i <= 5; i++) {
            for (k = 0; k < size - 1; k++)
                System.out.print(a[k] + " ");
            System.out.println();
        }
    }

}


