package Folders.Queue;

import java.util.Queue;

/**
 * QueueImplementingArray
 */
public class QueueImplementingArray {


     int max;
    int[] que;
    int rear;
    int front;

    QueueImplementingArray(int max) {

        this.max = max;
        this.que = new int[max];

        this.rear = -1;
        this.front = -1;
    }

    public  void insertRule(int value){
        if(rear == max-1){
            System.out.println("Array  is Full!!");
            return;
        }
        rear++;
        que[rear]= value;
    }


    public void display(){
        if(front==-1 && rear ==-1){

            System.out.println("Queue is Empty");
            return;
        }

        for(int i=0;i<=rear;i++){
            System.out.println(que[i]);
        }
    }

    

    public static void main(String[] args) {

        QueueImplementingArray ob = new QueueImplementingArray(5);
        ob.insertRule(10);
        ob.insertRule(23);
        ob.insertRule(45);

        ob.display();


        

    }

    
}