package Folders.LinkedList;

class Node{
    String data;
    Node   next;

    Node(String valeString){
        this.data = valeString;
        this.next = null;
    }
}
public class LinkedList1 {


    public static void Print(Node hNode){

        while (hNode != null) {
            System.out.print(hNode.data);

            if(hNode.next != null){
                System.out.print("->");
            }

            hNode = hNode.next;
        }

    }
    public static void main(String[] args) {

        Node head = new Node("Manikandan");
        head.next = new Node("Tamil");
        head.next.next = new Node("Kalimantan");

        Print(head);
        
    }
}