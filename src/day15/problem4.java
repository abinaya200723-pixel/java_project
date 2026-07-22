package day15;

public class problem4 {

    public static void main(String[] args) {

        int n = 27;

        while (n > 1 && n % 3 == 0) {
            n = n / 3;
        }

        System.out.println(n == 1);
    }
}