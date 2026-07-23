
package day23;


import java.util.Stack;

public class problem2 {
    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};

        Stack<Integer> stack = new Stack<>();

        for(String s : tokens) {

            if(s.equals("+") || s.equals("-") ||
                    s.equals("*") || s.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                if(s.equals("+"))
                    stack.push(a+b);

                else if(s.equals("-"))
                    stack.push(a-b);

                else if(s.equals("*"))
                    stack.push(a*b);

                else
                    stack.push(a/b);
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        System.out.println(stack.pop());
    }
}