
package day22;

public class problem1 {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        Node node = head.next; // delete 5

        node.data = node.next.data;
        node.next = node.next.next;

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}