
class Node
{
    int data;
    Node next;
    Object next;
    Node(int data)
    {
        this.data=data;
    }
}

class Linkedlist
{
    Node head;
    Node tail;
    int size;
      void AtTail(int data)
     {
        Node temp=new Node(data);
       if (tail == null) {
        head = temp;
        tail = temp;
       }
        else{
            tail.next=temp;
            tail=temp;
        }
       
     }

     void athead(int data)
     {
        Node temp=new Node(data);
        if(head==null)
            head=tail=null;
        else{
            temp.next=head;
            head=temp;
        }
     }
     void deleteAtHead()
     {
        if(head==null)
        {
            System.out.print("list is empty");
            return;
        }
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        
     
    }
    void atAnyPos(int pos, int data) {
    // invalid position
    if (pos < 0 || pos > size) {
        System.out.println("Invalid position");
        return;
    }

    Node newNode = new Node(data);

    // insert at head
    if (pos == 0) {
        newNode.next = head;
        head = newNode;
        size++;
        return;
    }

    // traverse to (pos-1)
    Node temp = head;
    for (int i = 0; i < pos - 1; i++) {
        temp = temp.next;
    }

    // insert
    newNode.next = temp.next;
    temp.next = newNode;

    size++;
}
    void display()
    {
        if(head==null)
            return;
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class linkedListCreation {
    public static void main(String[] args) {
        Linkedlist ls=new Linkedlist();
        ls.AtTail(10);
        ls.AtTail(24);
        ls.AtTail(47);
        ls.display();
    }
}
