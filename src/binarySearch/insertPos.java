package binarySearch;
import java.util.*;

public class insertPos{
    public static void main(String[] args) {
        int[] nums= {2, 4, 5, 9, 11, 27};
        int key= 7;
        int ans= nums.length;

        int low=0;
        int high= nums.length-1;

        while (low<=high){
            int mid= (low+high)/2;

            if(nums[mid]>=key){
                ans=mid;
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}