package CircularLinkedList;

public class LL {

    public class Node{
        int value;
        Node next;
    }

    Node head;
    int size;
    public void insert(int value){
        Node temp = head;
        Node node = new Node();
        node.value=value;
        if(head == null) {
            head = node;
            size++;
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node insertRec(int position, int value, Node initialNode) {
        if(initialNode == null) {
            initialNode = head;
        }
        if(position == 0){
            Node node = new Node();
            node.value  = value;
            node.next = initialNode.next;
            initialNode.next = node;
            return initialNode;
        }

        initialNode.next = insertRec(position - 1, value , initialNode.next);
        return initialNode;
    }


    public void speacialInsert() {

        Node node = head;

        while(node.next != null){
            node = node.next;
        }

        Node node2 = head.next;

        node.next = node2;

        System.out.println("Insert successful");


    }

    public void detectCycle() {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                System.out.println("cycle exists");
                return;
            }
        }
        System.out.println("No cycle");
    }

    public void checkLengthOfCycle() {
        Node slow = head;
        Node fast = head;
        int length = 1;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                System.out.println("cycle exists");
                slow = slow.next;
                while(slow != fast) {
                    slow = slow.next;
                    length++;
                }
                System.out.println("Length of cycle = " +length);
                return;
            }
        }
    }



}
