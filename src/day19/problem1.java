
package day19;


import java.util.HashMap;

public class problem1 {
    public static void main(String[] args) {

        int[] nums = {0,1,0};

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);

        int count = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==1)
                count++;
            else
                count--;

            if(map.containsKey(count)){
                max = Math.max(max, i-map.get(count));
            }
            else{
                map.put(count,i);
            }
        }

        System.out.println(max);
    }
}