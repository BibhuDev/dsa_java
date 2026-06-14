package array;
import java.util.*;

public class twosum {
    public int[] twoSum(int[] arr, int target_sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int complement = target_sum - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr= {2, 3, 6, 7, 1, 6};
        int target_sum= 4;

        twosum obj = new twosum();
        int[] res = obj.twoSum(arr, target_sum);

        System.out.println(Arrays.toString(res));
    }
}