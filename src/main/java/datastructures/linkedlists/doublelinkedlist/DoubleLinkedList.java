package datastructures.linkedlists.doublelinkedlist;

public class DoubleLinkedList {

    private Node first;
    private Node last;

    public DoubleLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEMpty(){
        return first == null;
    }

     public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEMpty()){
            last = newNode;
        }else{
            first.previous = newNode;
        }

        newNode.next = first;
        this.first = newNode;
     }

     public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEMpty()){
            first = newNode;
        }else{
            last.next = newNode;
            newNode.previous = last;
        }

        last = newNode;
     }

     public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){
            last = null;
        }else{
            first.next.previous = null;
        }

        first = first.next;
        return temp;
     }

    public Node deleteLast(){
        Node nodeTemp = last;

        if(first == null){
            first = null;
        }else{
            last.previous.next = null;
        }
        last = nodeTemp.previous;

        return nodeTemp;
    }

    public boolean insertAfter(int key, int data){
        Node current = first;

        while(current.data != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if(current == last){
            current.next = null;
            last = newNode;
        }else{
            newNode.next = current.next;
            current.next.previous = newNode;
        }

        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    public boolean deleteFromAKey(int key){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }

        if(current == first){
            first = current.next;
        }else {

            current.previous.next = current.next;

        }

        if(current == last){
            last = current.previous;
        }else{
           current.next.previous = current.previous;
        }

        return true;

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
}
