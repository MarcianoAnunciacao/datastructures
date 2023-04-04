package datastructures;

class Node {
    int data;
    static int count;
    Node next;

    static Node head;
    static Node tail;

    public static Node insert(Node head,int data) {
        if(head == null){
            head = new Node();
            tail = new Node();
        }else if(head.next == null){
            Node temp = new Node();
            temp.data = data;
            head.next = temp;
            tail.next = temp;
            count++;
        }else {
            Node temp = new Node();
            temp.data = data;
            tail.next.next = temp;
            tail.next = temp;
            count++;
        }
        return head;
    }

    public static Node delete(Node head, int data) throws Exception {
        if(head == null){
            throw new Exception("Linked List is empty");
        }
        Node temp = head.next;
        Node prev = head;
        while(temp != null){
            if(temp.data == data){
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head.next;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }


    public static void main(String args[]) {
        Node head = null;
        head = insert(head, 12);
        display(head);

        insert(head, 78);
        insert(head, 85);
        insert(head, 95);
        insert(head, 105);
        insert(head, 205);
        insert(head, 305);
        display(head);
        System.out.println("---------------------------------------------------");
        try{
            delete(head, 85);
        }catch (Exception e){
            System.out.println("Error, please check it out -> ".concat(e.getMessage()));
        }
        display(head);
    }
}
