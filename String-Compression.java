class Solution {
    public int compress(char[] chars) {
        int ind=0;
        int i=0;
        while(i<chars.length){
           char currchar=chars[i];
           int count=0;
           while(i<chars.length && chars[i]==currchar){
            i++;
            count++;
           }
           chars[ind++]=currchar;
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[ind++] = c;
                }
            }
        }
        return ind;
    }
}