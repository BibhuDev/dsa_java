package binarySearch;
import java.util.*;

public class minEle {
    public static void main(String[] args) {
        int[] nums= {7, 8, 9, 0, 1, 2, 4, 6};
        int min = Integer.MAX_VALUE;

        int low=0;
        int high= nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[low]<=nums[mid]){
                min= Math.min(min, nums[low]);
                low=mid+1;
            }else{
                min= Math.min(min, nums[mid]);
                high=mid-1;
            }
        }
        System.out.println(min);
    }
}