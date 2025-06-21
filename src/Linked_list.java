public class Linked_list {
    Node head;
    private int size;

    Linked_list() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst (String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast (String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void delFirst() {
        if (head == null){
            return;
        }
        size--;
        Node currNode = head;
        head = currNode.next;
    }

    public void delLast(){
        if (head == null) {
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node sec_lastnode = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            sec_lastnode = sec_lastnode.next;
        }
        sec_lastnode.next = null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            if (currNode.next == null){
                System.out.print(currNode.data);
                System.out.println();
                return;
            }
            else {
                System.out.print(currNode.data+ " -> ");
                currNode = currNode.next;
            }
        }

    }

    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.addFirst("Apple");
        list.addLast("Bat");
        list.addLast("Cat");
        //list.delLast();
        //list.delFirst();
        list.printList();
        System.out.println("The size of the linked list is: " +list.getSize());

    }
}
