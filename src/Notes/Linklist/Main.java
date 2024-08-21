package Notes.Linklist;

public class Main {

    /*
    · Arrays are continuous memory allocation.
    · Linklist will not be a continuous memory allocation and the items are pointing towards
    the next box of the linked list. (It's not the c/c++ pointer it's like reference variable
    · These individual boxes are called as nodes.
    · Head & Tail are the reference variables that points to the first node and the last
    node of the LinkedList respectively.
    · Each box is a type of (type) Node, i.e. a class just like string and is not a
    primitive datatype defined in java.
    · Every box has a value and to whom it is pointing to. It points to some other object
    of type node. The tail finally points to the null.
    · The problem with LinkedList is that it can't be accessed randomly you need to traverse
    to the element you need to access. This is because every node is pointing to next node
    and has no idea what's after that, this thing simply ends when a node points to null. So
    there is also no idea about how long the LinkedList is.

    · Types of Linked List-:
        1. Singly LinkedList
        2. Doubly LinkedList
        3. Circular LinkedList
        4. Circular Doubly LinkedList
    */

    public static void main(String[] args) {
        //custom LinkedList -> in LL class in the same package.

        LL list = new LL();

        list.insertFirst(6);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(9);
        list.insertLast(10);
        list.insert(3, 5);
        list.deleteFirst();
        list.deleteLast();
        list.delete(3);
        list.display();
        System.out.println(list.size());
    }
}
