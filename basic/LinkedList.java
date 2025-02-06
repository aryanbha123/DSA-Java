class LinkedList {
    class Node{
        Node next;
        int data;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public Node head = null;

    void insert(int val){
        Node newNode = new Node(val);
        if(head == null){ head = newNode; }
        else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    void display(){
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        list1.insert(0);
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.display();
    }
}