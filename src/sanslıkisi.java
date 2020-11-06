import java.util.Random;

public class sanslıkisi {
        public static void main(String[] args) {
            String str[]={"ahmet","mehmet","fırat","serhat","kasım","yusuf","semih","salih","hakan","aslı"};
            String str1[]={"ak","akbulut","hasan","genç","yaşlı","başaran","bulut","insan","kulaksız","kulak"};

            Random rand = new Random();
            int n = rand.nextInt(10);
            int i = rand.nextInt(10);
            System.out.println("şanslı kişi : " + str[n] + " " + str1[i]);

        }
    }


