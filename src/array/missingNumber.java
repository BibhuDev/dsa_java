package array;
import java.util.*;

public class missingNumber {
    public static void main(String[] args) {

        int[] nums= {1,0,3};

        int sum=0;
        int n= nums.length;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }

        int req_sum= n*(n+1)/2;
        int missing_number = req_sum-sum;

        System.out.println(missing_number);
    }
}