import java.util.*;

  public class R3 {
        public int[][] threeSum(int[] nums) {

            Arrays.sort(nums);

            ArrayList<int[]> list = new ArrayList<>();

            for (int i = 0; i < nums.length - 2; i++) {

                // Skip duplicate first values
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {

                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {

                        list.add(new int[]{
                                nums[i],
                                nums[left],
                                nums[right]
                        });

                        left++;
                        right--;

                        // Skip duplicates
                        while (left < right &&
                                nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right &&
                                nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            int[][] result = new int[list.size()][];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
        }
    }

