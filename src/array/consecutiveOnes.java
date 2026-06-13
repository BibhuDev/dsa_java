package array;
import java.util.*;
import static java.lang.Math.max;

public class consecutiveOnes {
    public static void main(String[] args) {
        int[] arr= {1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1};
        int maxi=0;
        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1) {
                count+=1;
                maxi=max(maxi, count);
            }else{
                count=0;
            }
        }

        System.out.println(maxi);
    }
}