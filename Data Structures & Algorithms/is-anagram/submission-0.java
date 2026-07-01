class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character, Integer> check1 = new HashMap<>();
            HashMap<Character, Integer> check2 = new HashMap<>();
            if (s.length() != t.length()) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
             int a = check1.putIfAbsent(s.charAt(i),0) == null ? 0 : check1.replace(s.charAt(i),  check1.get(s.charAt(i))+1);
             int b = check2.putIfAbsent(t.charAt(i),0) == null ? 0 : check2.replace(t.charAt(i),  check2.get(t.charAt(i))+1);
            }
            if (check1.equals(check2)) {
               // System.out.println("True");
                return true;
            }
          //  System.out.println("False");
            return false;
    }
}
