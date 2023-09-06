public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int val = 1;
            left = 0;
            right = nums.length - 1;
            while (left != i || right != i) {
                if (left < i) {
                    val *= nums[left++];
                }

                if (right > i) {
                    val *= nums[right--];
                }
            }
            nums[i] = val;
        }
        return answer;
    }
} 
