package day15;

public class problem2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println(count >= 2);
    }
}
