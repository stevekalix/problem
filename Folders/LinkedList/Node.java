package Folders.LinkedList;

public class Node {

    String data;
    Node next;

    Node( String new_data ){
        this.data = new_data;
        this.next = null;
    }


    public static void main(String[] args) {
        
        Node head = new Node("Mani");
         head.next = new  Node("Tamil");
         head.next = new Node("Kalix");



        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
        }
    }

    
}
