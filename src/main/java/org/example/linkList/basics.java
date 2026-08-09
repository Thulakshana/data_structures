package org.example.linkList;

public class basics {

    //craete node structure
    //linklist
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        //create nodes
        Node node1=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        Node node4=new Node(40);

        //create head
        Node head=node1;

        //connect node
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        //travel
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next; //move to the next node
        }


    }

    //travel

}
