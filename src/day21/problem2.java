
package day19;



import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        int n = nums.length;

        int[] ans = new int[n];

        ans[0] = 1;

        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int right = 1;

        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}