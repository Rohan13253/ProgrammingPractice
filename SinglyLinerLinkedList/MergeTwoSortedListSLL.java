class Node {

    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    
}

class SinglyLL
{
    Node head;
    void Display()
    {

        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    void InsertFirst(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;

    }

    void InsertLast(int data)
    {
        if(head == null)
        {
            Node newNode= new Node(data);
            newNode.next = null;
            head = newNode;
        }
        else
        {
            Node newNode = new Node(data);

            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next =newNode;
            newNode.next = null;


        }

    }

    void InsertAtPos(int data,int pos)
    {
        
        int size = 0;
        Node temp = head;

        while(temp != null)
        {
            size++;
            temp = temp.next;
        }

        if (pos < 0 || pos > size) 
        {
            return; 
        }

        if(pos == 0)
        {
            InsertFirst(data);
        }
        else if(pos == size)
        {
            InsertLast(data);
        }
        else
        {
            Node newNode = new Node(data);

           temp = head;

           for(int i = 1 ; i<= pos -1;i++)
           {
            temp = temp.next;
           }

           newNode.next = temp.next;
           temp.next = newNode;

        }
    }



    void DeleteFirst()
    {
        if(head == null)
        {
            head = null;
        }
        else if (head.next == null) 
        {
            head = null;
        }
        else
        {
            head = head.next;
        }
    }

    void DeleteLast()
    {
        if(head == null)
        {
            head = null;
        }
        else if (head.next == null) 
        {
            head = null;
        }
        else
        {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
            
        }

    }

    void DeleteAtPos(int pos)
    {
        
        int size = 0;
        Node temp = head;

        while(temp != null)
        {
            size++;
            temp = temp.next;
        }

        if (pos < 0 || pos >= size) 
        {
            return; 
        }

        if(pos == 0)
        {
            DeleteFirst();
        }
        else if(pos == size - 1)
        {
            DeleteLast();
        }
        else
        {
           temp = head;

           for(int i = 1 ; i<= pos -1;i++)
           {
            temp = temp.next;
           }

           temp.next = temp.next.next;
        }
    }

    void Reverse()
    {
        Node prev = null;
        Node curr = head;
        

        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 

        }
        head = prev;

    }

    Node findMiddle()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        //second(Upper) middle ex 4 for 6 node add .next if want lower middle
    }

    Node findNthFromLast(int pos)
    {
        Node slow = head;
        Node fast = head;

        int i = 0;
        while(i < pos)
        {
            fast = fast.next;
            i++;
        }

        while (fast != null )
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    Node MergeTwoSortedList(Node L1,Node L2)
    {
        Node dummyNode = new Node(0);
        Node current = dummyNode;

        Node ptr1 = L1;
        Node ptr2 = L2;

        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.data <= ptr2.data)
            {
                current.next = ptr1;
                ptr1 = ptr1.next;
            }
            else if(ptr1.data >= ptr2.data)
            {
                current.next = ptr2;
                ptr2 = ptr2.next;
            }

            current = current.next;
        }

        if(ptr1 == null)
        {
            current.next = ptr2;
        }else
        {
            current.next = ptr2;
        }

        return dummyNode.next;
    }

}

public class MergeTwoSortedListSLL {
    
public static void main(String[] args) 
{
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);

    SinglyLL LL = new SinglyLL();
    LL.head = head;

    LL.Display();
    
}
}
