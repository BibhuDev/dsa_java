package array;
import java.util.*;

public class maxSubarrSum {
    public static void main(String[] args) {
        int[] nums= {-2, 1, -3, 4, 2, -5, -2, 3};

        int max= Integer.MIN_VALUE;
        int sum=0;

        for(int num: nums){
            sum+=num;
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}