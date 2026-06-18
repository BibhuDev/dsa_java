package array;
import java.util.*;

public class rearrangeArr {
    public static void main(String[] args) {
        int[] nums= {3, 4, -1, 7, -2, -8};
        int pos=0;
        int neg=1;

        int[] ans = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            if(nums[i]>=0){
                ans[pos] = nums[i];
                pos+=2;
            }else{
                ans[neg]= nums[i];
                neg+=2;
            }
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }
}