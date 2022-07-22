import java.util.LinkedList;

/**
 * This algorithm takes a created Linked List and as an input
 * and outputs the reverse of it. This also shows shortcuts of using a linked list,
 * rather than creating full nodes
 * */
public class ReversedLinkedList {
    
    static Node head;                               //creating the Node "head" representing the top of the list
    static class Node{                              //Linked list Node
        int data;                                   
        Node next;
    
        Node (int d){                               //constructor to create a new node
            data = d;
            next = null;                            //constructor is initialized as null
        }
    }
    
     Node reverse (Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
            node = prev;
            return node;
        }
    
    public void printList(Node node){
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

public static void main(String[] args) {
    LinkedList<Integer> linkedlist = new LinkedList<Integer>();     //creates an object linkedlist
    linkedlist.add(1);                                           //adds the value 1 into the linkedlist object
    linkedlist.add(2);
    linkedlist.add(3);
    linkedlist.add(4);

    System.out.println("The initial Linked List is: ");
    System.out.print(linkedlist + "\n");

    linkedlist.addFirst(100);
    linkedlist.addLast(000);

    System.out.println("The modified Linked List is: ");
    System.out.print(linkedlist + "\n");
    System.out.println("\n");
    System.out.println("\n");
    

    System.out.println("Creating a Linked List with nodes...");
    System.out.println("\n");
    ReversedLinkedList list = new ReversedLinkedList();
    list.head = new Node(4);
    list.head.next = new Node(3);
    list.head.next.next = new Node(2);
    list.head.next.next.next = new Node(1);
    System.out.println("The Linked List created with nodes is: ");
    list.printList(head );
    System.out.println("\n");
    head = list.reverse(head);
    System.out.println("The Linked List after reversing it is: ");
    list.printList(head);

 }


 }
    

    