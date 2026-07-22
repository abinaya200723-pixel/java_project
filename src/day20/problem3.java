package day20;

public class problem3 {

    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while(sum >= target) {

                min = Math.min(min, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        if(min == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(min);
    }
}