
package day19;

public class problem2 {

    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};

        int total = 0;

        for (int n : nums)
            total += n;

        int left = 0;
        int result = -1;

        for (int i = 0; i < nums.length; i++) {

            if (left == total - left - nums[i]) {
                result = i;
                break;
            }

            left += nums[i];
        }

        System.out.println(result);
    }
}