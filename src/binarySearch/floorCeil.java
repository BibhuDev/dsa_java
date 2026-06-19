package binarySearch;
import java.util.*;

public class floorCeil {
    public static void main(String[] args) {
        int[] nums= {10, 20, 30, 40, 50};
        int x= 40;

        int floor= 0;
        int ceil= 0;

        int low=0;
        int high= nums.length-1;

        while(low<=high){
            int mid= (low+high)/2;
            if(nums[mid]<=x){
                floor= nums[mid];
                low= mid+1;
            }else{
                high=mid-1;
            }
        }

        low=0;
        high= nums.length-1;

        while(low<=high){
            int mid= (low+high)/2;
            if(nums[mid]>=x){
                ceil= nums[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        System.out.println("floor: "+floor+", ceil: "+ceil);
    }
}