package array;
import java.util.*;

public class buysellStock {
    public static void main(String[] args) {
        int[] prices= {7, 3, 1, 2, 8, 4};
        int min= prices[0];
        int profit= 0;

        for(int i=1; i< prices.length; i++){
            int cost = prices[i]-min;
            profit= Math.max(profit, cost);
            min= Math.min(min, prices[i]);
        }

        System.out.println(profit);
    }
}