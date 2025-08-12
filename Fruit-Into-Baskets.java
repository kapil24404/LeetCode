class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int maxlen=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int left=0;
        for(int right=0;right<n;right++){
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
            while(hm.size()>2){
               int lf = fruits[left];
                hm.put(lf, hm.get(lf) - 1);
                if (hm.get(lf) == 0) {
                    hm.remove(lf);
                }
               left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}