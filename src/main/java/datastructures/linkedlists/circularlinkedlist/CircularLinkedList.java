package datastructures.linkedlists.circularlinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    private boolean isEmpty() {
        return first==null;
    }

    public void insertLast(int data){
         Node newNode = new Node();
         newNode.data = data;

         if(isEmpty()){
             first = newNode;
         }else{
             last.next = newNode;
             last = newNode;
         }
    }

     public int deleteFirst(){
        int temp = first.data;

        if(first.next == null){
            last = null;
        }

        first = first.next;
        return temp;
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