package datastructures.linkedlists.singlylinkedlist;

public class SinglyLinkedList {

    private Node first;
    private Node last;

    public boolean isEMpty(){
        return (first == null);
    }

    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return  temp;
    }

    public void displayList(){
        System.out.println("List (first --. last)");
        Node current = first;

        while(current != null){
            current.displayMode();
            current = current.next;
        }

        System.out.println(" ");
    }

    public void insertLast(int data){
        Node current = first;
        while(current.next != null){
            current = current.next;
        }

        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}