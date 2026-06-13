package array;
import java.util.*;

public class singleNumber {
    public static void main(String[] args) {
        int[] arr= {1, 1, 3, 4, 4, 5, 5};
        int xorr=0;

        for(int n: arr){
            xorr= xorr^n;
        }

        System.out.println(xorr);
    }
}