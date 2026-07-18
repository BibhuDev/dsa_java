package recursion;
import java.util.*;
class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(int index, int[] candidate, int target, List<Integer> curr, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(index==candidate.length || target<0){
            return;
        }

        curr.add(candidate[index]);
        backtrack(index, candidate, target-candidate[index], curr, ans);
        curr.remove(curr.size()-1);

        backtrack(index+1, candidate, target, curr, ans);
    }
}