package Folders.LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedList {


    public static Node Insert(Node hNode , int val ){
        Node newNode = new Node(val);
        newNode.next = hNode;
        hNode = newNode;
        return  newNode;
    }


    public static Node insertAtPosition1(Node hNode, int val , int position){

       
        if(position == 1){
            Node node_new = new Node(val);
            node_new.next = hNode;
            return node_new;
        }
        Node curr = hNode;
        int index =1;

        while (index<position && curr!=null) {
            curr = curr.next;
            index++;
        }
        Node newname = new Node(val);
        newname.next = curr.next;
        curr.next = newname;

        return  hNode;
    }
    public static void Print(Node head) {
        if (head == null) {
            System.out.println("List is Empty ");
        }
        while (head != null) {
            System.out.print(head.data);

            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Scanner sc = new Scanner(System.in);
        // int number_Input = sc.nextInt();
        // while (0<number_Input) {
        //     int user_enter_Data = sc.nextInt();
        //     head = Insert(head,user_enter_Data);
        //     number_Input--;
        // }

        head = insertAtPosition1(head, 990 ,3);

    
        Print(head);
        sc.close();

    }



}
