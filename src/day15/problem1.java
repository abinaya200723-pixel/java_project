package day15;

public class problem1 {

    public static void main(String[] args) {

        int low = 3;
        int high = 7;

        int count = 0;

        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}

