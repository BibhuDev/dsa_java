package recursion;
import java.util.*;

class Solution40{
    public List<List<Integer>> combinationIIsum(int[] candidates, int target){
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int start, int[] candidate, int target, List<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start; i< candidate.length; i++){
            if(i>start && candidate[i] == candidate[i-1]){
                continue;
            }

            if (candidate[i] > target) {
                break;
            }

            curr.add(candidate[i]);
            backtrack(i + 1, candidate, target - candidate[i], curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}