
package day22;

public class problem3 {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(4);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(4);

        Node dummy = new Node(0);
        Node temp = dummy;

        while(a != null && b != null) {

            if(a.data <= b.data) {
                temp.next = a;
                a = a.next;
            }
            else {
                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        if(a != null)
            temp.next = a;

        if(b != null)
            temp.next = b;


        temp = dummy.next;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}