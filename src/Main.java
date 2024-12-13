import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        /// Binary search method


        var baneryList = new ArrayList<Integer>();

        int a = 14;

        for (int i = 0; i <= a; i++) {
            baneryList.add(i);
        }

        System.out.println(baneryList);
        int left = 0;
        int right = baneryList.size() - 1;
        int b = 100;
        System.out.println("index " + baneryList.get(left));

        for(int j=0; left <= right; j++) {
            int mid = (left + right) / 2;
            System.out.println("mid "+ mid);
            if(b <baneryList.get(mid) ) {
                System.out.println(mid);
                System.out.println("eded tapildi: "+b);
            }
            else if( baneryList.get(mid) >= b) {
                System.out.println("eded tapildi:"+b);
            }
            else System.out.println("eded tapilmadi: "+ b);

break;
        }
    }
}
