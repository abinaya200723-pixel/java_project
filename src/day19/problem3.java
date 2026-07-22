
package day19;

import java.util.HashMap;

public class problem3{
    public static void main(String[] args) {

        int[] nums = {1,-1,5,-2,3};
        int k = 3;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);

        int sum = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++){

            sum += nums[i];

            if(map.containsKey(sum-k)){
                max = Math.max(max, i-map.get(sum-k));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        System.out.println(max);
    }
}