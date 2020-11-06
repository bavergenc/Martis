public class metod2 {
    public static int dortiletopla(int a){
        return a*4;
    }
    public static int ikiiletopla(int a){
        return a+2;
    }
    public static int ikiilecarp(int a){
        return a*2;
    }
    public static void main(String[] args) {

        System.out.println("sonuç  : "+dortiletopla(ikiiletopla(ikiilecarp(8))));


    }
}

