package binarySearch;
import java.util.*;

public class peakElement {
    public static void main(String[] args) {
        int[] nums= {2, 3, 1, 5, 9, 6};
        int low=0;
        int high= nums.length-1;

        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1]){
                high = mid;
            }else{
                low= mid+1;
            }
        }
        System.out.println(nums[low]);
    }
}
