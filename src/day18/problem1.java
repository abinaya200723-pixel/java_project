package day18;
public class problem1 {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = s.length() - 1;

        boolean result = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                result = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(result);
    }
}
