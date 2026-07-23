
package day22;

public class problem2 {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node common = new Node(8);
        common.next = new Node(10);

        Node a = new Node(3);
        a.next = new Node(7);
        a.next.next = common;

        Node b = new Node(99);
        b.next = common;

        Node p1 = a;
        Node p2 = b;

        while(p1 != p2) {

            if(p1 == null)
                p1 = b;
            else
                p1 = p1.next;

            if(p2 == null)
                p2 = a;
            else
                p2 = p2.next;
        }

        System.out.println(p1.data);
    }
}