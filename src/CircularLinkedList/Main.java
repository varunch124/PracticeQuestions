package CircularLinkedList;

public class Main {

    public static void main(String[] args){
        LL ll = new LL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.print();
        ll.insertRec(2, 5, null);
        ll.print();
        ll.speacialInsert();
        ll.detectCycle();
        ll.checkLengthOfCycle();
        System.out.println(ll.size);



    }
}
