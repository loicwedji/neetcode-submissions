class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> word = new HashMap();
        for(int i = 0; i<strs.length; i++){ // for each string
        char[] arr = strs[i].toCharArray(); // convert to char array
        Arrays.sort(arr); //sort
        String n = new String(arr); //convert to string

           if(word.containsKey(n)){ // if the word is in the map
        List<String> b = word.get(n); // add 
        b.add(strs[i]);
           word.replace(n,b); // add the word in the list
           }else{ // if the word is not in the list
           List<String> group = new ArrayList(); //make a new list
           group.add(strs[i]); // add word to it
           word.put(n,group); // add tuple
           }
        }//once we have a hashmap of similar words

        List<List<String>> full = new ArrayList();

        for(List<String> value : word.values()){ //iterate through each hashmap and store their lists

            full.add(value); // store lists
        }
return full;
    }
}