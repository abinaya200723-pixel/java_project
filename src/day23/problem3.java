package day23;

import java.util.*;

public class problem3{
    public static void main(String[] args) {

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int n : nums2) {

            while(!stack.isEmpty() && stack.peek() < n) {
                map.put(stack.pop(), n);
            }

            stack.push(n);
        }

        while(!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++) {
            ans[i] = map.get(nums1[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
