package array;
import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 5, 5, 1, 2, 5, 2, 2, 5, 2};
        int count=0;
        int candidate=0;

        for(int num : nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }

        System.out.println("Majority element: "+ candidate);
    }
}