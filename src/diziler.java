public class diziler {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i] + "çift");
        }
        for(int i = 0; i < 10; i ++)
            if(a[i] % 2 == 1)
                System.out.println(a[i] + "tek");

    }

}

