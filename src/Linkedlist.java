public class Linkedlist {
    Node head;

    void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    void display(){
        Node temp = head;

        while (temp!= null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.display();
    }

}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}



