package day23;


import java.util.LinkedList;
import java.util.Queue;

public class problem4 {

    static class MyStack {

        Queue<Integer> q = new LinkedList<>();

        void push(int x) {

            q.add(x);

            int size = q.size();

            while(size > 1) {
                q.add(q.remove());
                size--;
            }
        }

        int pop() {
            return q.remove();
        }

        int top() {
            return q.peek();
        }

        boolean empty() {
            return q.isEmpty();
        }
    }


    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}