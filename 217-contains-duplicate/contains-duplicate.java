import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> seen = new HashSet<>();

      for (int i = 0; i<nums.length; i++){
        int temp = nums[i];

        if(seen.contains(temp)){
            return true;
        }
        seen.add(temp);
      }
      return false;
}
    }