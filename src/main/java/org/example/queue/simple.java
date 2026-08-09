package org.example.queue;

public class simple {
    //queue = first in first out
    //create queue
    static class myqueue{
        int[] queue;
        int front;
        int rear;

        // front =0 point to the first element
        //rear=-1 //point of last element

        //10 ,20,30
        //0,1,3
        //0=front
        //3=rear

        myqueue(int size){
            queue=new int[size];
            front=0;
            rear=-1;
        }

        void enqueue(int value){
            if(rear==queue.length-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            queue[rear]=value;
        }

        //dequeue
        int dequeue(){ //front element eka ain wenne
            if(front>rear){
                System.out.println("queue is empty");
                return -1;
            }
            int value =queue[front];
            front++;
            return  value;
        }

        //peek
        int peek(){
            if(front>rear){
                System.out.println("queue is empty");
                return -1;
            }
            return queue[front];
        }

        //isempty
        boolean isempty(){
            return front>rear;
        }

    }

    public static void main(String[] args) {
        myqueue obj=new myqueue(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);

        System.out.println(obj.queue.length);
        System.out.println(obj.queue.length-1);

        System.out.println(obj.peek());
        System.out.println(obj.dequeue());
        System.out.println(obj.isempty());
    }
}
