package Folders.LinkedList;

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class MidOfLinkedList {

    // public static void midvalue(Node hNode){

    //     Node s_Pointer  = hNode;
    //     Node F_pointer = hNode;

    //     while (s_Pointer!= null && F_pointer!=null) {
    //        s_Pointer = s_Pointer.next;
    //        F_pointer = F_pointer.next.next;
    //     }

    //     System.out.println(s_Pointer.data);

    // }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        // midvalue(head);
        Node temp = head;

        int count = 0;
        while (head!=null) {
            count++;
            head = head.next;
        }

        count = count/2;

        int index =1;
        while (index<count && temp!=null) {
            temp = temp.next;
            index++; 
        }

        System.out.println(temp.data);
      
      

    }
}
