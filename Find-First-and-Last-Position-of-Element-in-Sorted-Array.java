class Solution {

    // Function to find the first occurrence of x in a sorted array
    static int findFirstOccurrence(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                ans = mid;
                end = mid - 1; 
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int findLastOccurrence(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                ans = mid;
                start = mid + 1; 
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findFirstOccurrence(nums, target);
        if (firstOccurrence == -1) {
            return new int[]{-1, -1};
        }
        int lastOccurrence = findLastOccurrence(nums, target);
        return new int[]{firstOccurrence, lastOccurrence};
    }
}
