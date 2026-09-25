package Folders.LinkedList;

public class Node {

    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }

    public static Node insert(Node hNode, int sum) {
          Node InsertNode = new Node(sum);
          InsertNode.next = hNode;
          return InsertNode;
    
    }

    public static Node insertEnd(Node hNode , int value){

        Node newnodeE = new Node(value);

        Node tNode = hNode;
        while (tNode!=null) {
            tNode = tNode.next;
        }
        newnodeE.next= tNode;

        return  newnodeE;

    }

    public static void isPrint(Node hNode) {

        while (hNode != null) {
            System.out.print(hNode.data);
            if (hNode.next != null) {
                System.err.print("->");
            }
            hNode = hNode.next;
        }

    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(24);
        head.next.next = new Node(11);
        head.next.next.next = new Node(20);
        head = insert(head, 100);
        head = insertEnd(head, 200);

        isPrint(head);

    }

}
