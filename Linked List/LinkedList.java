import org.w3c.dom.Node;

/**Compared to an array, the size of a linked list is not limited.
 * Insertion/deletion of an element in a linked list is less expensive and easier.
 * 
 * The drawback is that random access is not available, meaning we have to access the elements sequentially
 * (it is possible to do binary search with linked lists but not with its default application - refer to projects).
 * Extra memory space for a pointer is required with each elemnt of the list.
 * Not cache friendly.
 */
public class LinkedList {
        Node head;      //the head of the list
        static class Node{
            int data;
            Node next;
            Node (int d){       //constructor to create a new node
                data = d;       
                next = null;    //next is default intialized as null
            }
        }
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();    //creating an object with an empty list

    }
}
