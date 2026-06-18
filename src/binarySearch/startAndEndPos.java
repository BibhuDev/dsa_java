package binarySearch;
import java.util.*;

public class startAndEndPos {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int low= 0;
        int high= nums.length-1;
        int firstIndex=-1;
        int lastIndex=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            } else if (nums[mid]>target){
                high=mid-1;
            } else{
                firstIndex = mid;
                high = mid-1;
            }
        }

        low=0;
        high= nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            } else if (nums[mid]>target){
                high=mid-1;
            } else{
                lastIndex = mid;
                low = mid+1;
            }
        }

        System.out.println("["+firstIndex+","+lastIndex+"]");
    }
}