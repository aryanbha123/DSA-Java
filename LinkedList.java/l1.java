/**
 * l1
 */
public class l1 {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head == null) { head = newNode; return;}

        newNode.next = head;
        head = newNode;
    }

    void  display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    public static void main(String[] args) {
        l1 list = new l1();
        list.display();
        list.insertAtStart(1);
        list.insertAtStart(2);
        list.insertAtStart(3);
        list.insertAtStart(4);
        list.display();
    }
}