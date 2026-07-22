package day15;

public class problem3 {

    public static void main(String[] args) {

        int n = 10;

        int ans = 1;

        while (ans < n) {
            ans = (ans << 1) | 1;
        }

        System.out.println(ans);
    }
}