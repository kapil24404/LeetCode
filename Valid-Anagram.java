class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> hm=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
      }
       for(int i=0;i<t.length();i++){
        char ch1=t.charAt(i);
        hm.put(ch1,hm.getOrDefault(ch1,0)-1);
      }
      for(Map.Entry<Character,Integer> ans:hm.entrySet()){
        if(ans.getValue()!=0){
            return false;
        }
      } 
      return true;
    }
}