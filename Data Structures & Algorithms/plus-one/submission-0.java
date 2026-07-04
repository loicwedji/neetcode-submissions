class Solution {
    public int[] plusOne(int[] digits) {
         int max = digits.length - 1;
        if (digits[max] == 9) {//if the last digit is equal to 9 we must expand the array

            while (max != 0) { // while we carry over and we are not at the last index
                if (digits[max] != 9) { //if it's not 9
                    digits[max] += 1; // increment and return
                    return digits;
                } else { //if its a 9
                    digits[max] = 0; //replace by 0
                    max -= 1; //decrement by 1
                }
            }
            if (digits[0] == 9) { // if the first digit is 9
                int[] result = new int[digits.length + 1]; // in case it carries over fully
                result[0] = 1;
                return result;
            }
        }
        digits[max] += 1; // if the last digit is not zero we just increment and return it
        return digits;
    }
}
