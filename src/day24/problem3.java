package day24;


import java.util.HashSet;

public class problem3{
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        HashSet<Character> set = new HashSet<>();

        for(char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;

        for(char c : stones.toCharArray()) {

            if(set.contains(c))
                count++;
        }

        System.out.println(count);
    }
}