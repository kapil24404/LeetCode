class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            hm.put(ch1,hm.getOrDefault(ch1,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            if(hm.containsKey(ch2)){
                hm.put(ch2,hm.get(ch2)-1);
                if (hm.get(ch2) < 0) return false;
            }
            else return false;
        }
         for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() != 0) return false;
        }
        return true;
    }
}