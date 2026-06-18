package binarySearch;
import java.util.*;

public class bs {
    public static void main(String[] args) {
        int[] nums= {2, 4, 5, 9, 11, 25, 26};
        int target= 25;
        int n= nums.length;

        int low=0;
        int high= n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            } else if (nums[mid]>target){
                high=mid-1;
            } else{
                System.out.println("target ele found at: "+ mid);
                return;
            }
        }
        System.out.println("target not found");
    }
}