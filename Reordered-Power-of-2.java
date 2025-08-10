class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortDigits(n);
        for (int i = 0; i < 31; i++) { // 2^30 < 1e9
            if (target.equals(sortDigits(1 << i))) {
                return true;
            }
        }
        return false;
    }

    private String sortDigits(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}