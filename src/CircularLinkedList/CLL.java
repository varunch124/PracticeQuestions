package CircularLinkedList;

import javax.swing.undo.CannotUndoException;

public class CLL {

    private class Node {
        int value;
        Node next;
        private Node(int value){
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int size;


    public void insertFirst(int val){

        if(head == null) {
            Node node = new Node(val);
            head = node;
            tail = node;
            node.next = node;
            size ++;
            return;
        }

        Node node = new Node(val) ;
        node.next = head;
        tail.next = node;
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        System.out.print(temp.value + " -> ");
        temp = temp.next;
        while(temp != head){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println( + head.value);

    }

    public void insertLast(int val){

        Node node = new Node(val) ;
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex( int index, int val){
        Node temp = head;
        for(int i = 0; i < index; i++){
            Node node = new Node(val) ;
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

}
