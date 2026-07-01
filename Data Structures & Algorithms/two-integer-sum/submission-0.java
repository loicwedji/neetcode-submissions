class Solution {
    public int[] twoSum(int[] nums, int target) {
   HashMap<Integer, Integer> check = new HashMap();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!(check.get(target - nums[i]) == null)) { // if the difference is in the map ex(5-3 =2 so 2)
           result[0] = check.get(target - nums[i]);
           result[1] = i;
           return result;
            }
            check.put(nums[i], i);
        }
        return null;
    }
}
