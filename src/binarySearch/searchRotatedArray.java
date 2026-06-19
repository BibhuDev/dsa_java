package binarySearch;
import java.util.*;

public class searchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5};
        int target = 2;

        int low=0;
        int high= nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) System.out.print(mid);
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){ //in case of duplicates
                low++;
                high--;
                continue;
            }

            if(nums[low]<=nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high= mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
    }
}