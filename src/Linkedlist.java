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
    void insertatbeginning(int data){
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    void insertatend(int data){
        Node newnode = new Node(data);

        if (head == null ){
            head = newnode;
            return;
        }
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;

    }
    void search(int value){
         Node temp = head;

         while (temp!=null){

             if (temp.data == value){
                 System.out.println("value found");
                 return;
             }
             temp = temp.next;
         }
        System.out.println("Value Not Found");


    }
    void update(int old, int news){
        Node temp = head;
        while (temp!=null){
            if(temp.data == old){
                temp.data = news;
                System.out.println("updated value");
                return ;
            }
            temp = temp.next;

        }
        System.out.println("value not found");
    }
    void deleteatbegining(){

        if (head == null){
            System.out.println("ll is empty");
            return;
        }
        head = head.next;
    }

    void deleteatend(){
          if (head == null){
              System.out.println("ll is empty");
              return;
          }
          if (head.next == null ){
              head = null;
              return;
          }
          Node temp = head;

          while (temp.next.next != null){
              temp = temp.next;
          }
          temp.next = null;
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
        ll.search(20);
        ll.update(30,40);
        ll.display();
        ll.insertatbeginning(50);
        ll.insertatend(100);
        ll.display();
        ll.deleteatbegining();
        ll.deleteatend();
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



