class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> track = new Stack();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (i == 0) {
                track.push(i);
                continue;
            }
            if (temperatures[track.peek()] < temperatures[i]) {
                while (!track.empty() && temperatures[i] > temperatures[track.peek()]) {
                    int recent = track.pop();
                    result[recent] = i - recent;
                }
                track.push(i);
            } else {
                track.push(i);
            }

        }
        while (!track.empty()) {
            result[track.pop()] = 0;
        }
        return result;
    }
}
