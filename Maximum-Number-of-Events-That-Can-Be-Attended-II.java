class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events,Comparator.comparing(o->o[1]));
        int n=events.length;
        int[] endTimes = new int[n];
        for (int i = 0; i < n; i++) {
            endTimes[i] = events[i][1];
         }
        // int maxsum=0;
        // int sum=0;
        // for(int i=1;i<n;i++){
        //     if(firstevent!=events[i][0] && events[i][1]>firstevent){
        //         sum+=events[i-1][2]+events[i][2];
        //         maxsum=Math.max(sum,maxsum);
        //     }
        //    // firstevent=events[i][1];
        // }
        // return maxsum;
        int[][] dp = new int[n + 1][k + 1];
        
        for (int i = 1; i <= n; i++) {
            int[] curr = events[i - 1];
            int start = curr[0], end = curr[1], value = curr[2];
            int l = binarySearch(endTimes, start);

            for (int j = 1; j <= k; j++) {
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                dp[i][j] = Math.max(dp[i][j], dp[l + 1][j - 1] + value);
            }
        }

        return dp[n][k];
    }
     public int binarySearch(int[] endTimes, int target) {
        int low = 0, high = endTimes.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (endTimes[mid] < target) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }
}