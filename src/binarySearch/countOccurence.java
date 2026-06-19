package binarySearch;
import java.util.*;

public class countOccurence {
    public static void main(String[] args) {
        int[] nums={0, 1, 1, 2, 3, 3, 3, 5};
        int target = 1;

        int low=0;
        int high= nums.length-1;

        int firstIndex= 0;
        int lastIndex= nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=target){
                lastIndex= mid;
                low= mid+1;
            }else{
                high= mid-1;
            }
        }

        low=0;
        high= nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                firstIndex= mid;
                high= mid-1;
            }else{
                low= mid+1;
            }
        }

        System.out.println("Target occurs for: "+ (lastIndex - firstIndex + 1));

    }
}