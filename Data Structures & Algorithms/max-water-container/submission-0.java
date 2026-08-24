class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int best = 0;
        while(left!=right){
          //get the smallest height
           int temp = Math.min(heights[left],heights[right]);
          // multiply by distance
           temp = (right-left)*temp;
           if (best<temp){
            best = temp;
           }
            if(Math.min(heights[left],heights[right])==heights[left]){ // if the left side is smallest
               left++;
            }else{
                right--;
            }
           // int temp = (right - left)* Math.min(heights[left],heigths[right]);
           
        }
        return best;
    }
}
