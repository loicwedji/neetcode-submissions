class Solution {
    public boolean hasDuplicate(int[] nums) {
            HashMap<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (check.putIfAbsent(nums[i],i)!=null) { // if the value has been found before
                return true;
            }
        }
        return false;
}
    }
