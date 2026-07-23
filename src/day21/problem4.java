
package day21;

public class problem4 {

    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int left = 0;
        int right = 0;

        for(int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        int ans = right;

        while(left <= right) {

            int mid = left + (right-left)/2;

            int day = 1;
            int sum = 0;

            for(int w : weights) {

                if(sum + w > mid) {
                    day++;
                    sum = 0;
                }

                sum += w;
            }

            if(day <= days) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        System.out.println(ans);
    }
}