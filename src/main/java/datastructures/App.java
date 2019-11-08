package datastructures;

import datastructures.linkedlists.circularlinkedlist.CircularLinkedList;
import datastructures.linkedlists.doublelinkedlist.DoubleLinkedList;
import datastructures.linkedlists.Node;
import datastructures.linkedlists.singlylinkedlist.SinglyLinkedList;
import datastructures.searching.linearsearch.LinearSearch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 4;

        Node nodeC = new Node();
        nodeC.data = 4;

        Node nodeD = new Node();
        nodeD.data = 4;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));

        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insert(100);
        myList.insert(58);
        myList.insert(99);
        myList.insert(88);

        myList.insertLast(9999999);

        myList.displayList();


        CircularLinkedList circularList = new CircularLinkedList();
        circularList.insertFirst(100);
        circularList.insertFirst(58);
        circularList.insertFirst(99);
        circularList.insertLast(88);

        circularList.insertLast(9999999);

        circularList.displayList();

        DoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.insertFirst(100);
        doubleList.insertFirst(99);
        doubleList.insertFirst(98);
        doubleList.insertFirst(97);
        doubleList.insertFirst(96);

        doubleList.deleteLast();

        doubleList.displayList();

        int [] elements = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 8, 55};

        System.out.println("Number in posicion : " + LinearSearch.search(elements, 2));


    }

    public static int listLength(Node aNode){
        int count = 0;
        Node nodeTemp = aNode;
        while(nodeTemp != null){

            count++;
            nodeTemp = nodeTemp.next;

        }

        return count;
    }
}