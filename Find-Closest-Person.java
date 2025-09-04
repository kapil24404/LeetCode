class Solution {
    public int findClosest(int x, int y, int z) {
        int sum1=Math.abs(x-z);
        int sum2=Math.abs(y-z);
        // System.out.println(sum1);
        // System.out.println(sum2);
        if(Math.abs(sum1)==Math.abs(sum2)) return 0;
        else if(sum1>sum2) return 2;
        else if(sum1<sum2) return 1;
        else return 0;
    }
}