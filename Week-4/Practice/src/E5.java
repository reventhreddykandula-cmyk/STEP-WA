public class E5 {
    public int[] rotateArray(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = nums[i];
        }

        return result;
    }
}

