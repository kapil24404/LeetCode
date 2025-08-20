class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char i:s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(char j:t.toCharArray()){
            if(hm.containsKey(j)){
                hm.put(j,hm.get(j)-1);
            }
            else return false;
        }
        for(Map.Entry<Character,Integer> ans:hm.entrySet()){
            if(ans.getValue()!=0) return false;
        }
        return true;
    }
}