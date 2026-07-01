class Solution {
    public boolean hasDuplicate(int[] nums) {
         HashSet<Integer> check = new HashSet<>();
        for (int num: nums){
            if (!check.add(num))
                return true;

        }
        return false;
}
    }
