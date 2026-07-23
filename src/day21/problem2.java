
package day21;

public class problem2 {

    public static void main(String[] args) {

        int[] piles = {3,6,7,11};
        int h = 8;

        int left = 1;
        int right = 11;

        int ans = right;

        while(left <= right) {

            int mid = left + (right-left)/2;

            int hours = 0;

            for(int p : piles) {
                hours += Math.ceil((double)p / mid);
            }

            if(hours <= h) {
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