public class Linkedlist{
    public static class Node {
        int val;
        Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int val){
        
        Node newNode=new Node(val);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int val){
        // create a new node
        Node newNode=new Node(val);
        size++;
        // checking the linkedlist is empty or not
        if(head==null){
            head =tail=newNode;
            return;
        }
        // linking process
        tail.next=newNode;
        // updating tail
        tail=newNode;

    }
    // Add in the middle
    public void addMiddle(int val,int idx){
    
        Node newNode=new Node(val);
        if(idx==0){
            addFirst(val);
            return ;
        }
        size++;

        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        // i=idx-1;temp=prev
        newNode.next=temp.next;
        temp.next=newNode;


    }
    // removing the elements from the front in the list.
    public int removeFirst(){
        if(size==0){
            System.out.println("the list is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.val;
            head=tail=null;
            return val;
        }
        int val=head.val;
        
        head=head.next;
        size--;
        return val;
    }
// deleting the elements from the end of the list.
public int removeLast(){
    Node prev=head;
    if(size==0){
        System.out.println("linkedlist is empty!!");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.val;
        head=tail=null;
        size=0;
        return val;
    }
    // prev:i=size-2;
    for(int i=0;i<size-2;i++){
        prev=prev.next;

    }
    int val=prev.next.val; 
    prev.next=null;
    tail=prev;
    size--;
    return val;
}
// linear search in linkedlist;

public int itrSearch(int key){
    if(size==0){
        return Integer.MIN_VALUE;
    }
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.val==key){
            return i;
        }
        temp=temp.next;
        i++;

    }
    return -1;
}
// recursive search
public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.val==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
   return helper(head,key);
   
   
}
// reversing the linkedlist
public void reverseList(){
    Node curr=tail=head;
    Node prev=null;
    Node next;
    while(curr != null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}
//Delete nth node from the last.
    public void deleteNthfromEnd(int n){
// calculate size;
int size=0;
Node temp=head;
while(temp!=null){
    temp=temp.next;
    size++;
}
if(n==size){
    head=head.next;
    return ;
}

// size -n 
int i=1;
int idxTofind=size-n;
Node prev=head;
while(i<idxTofind)
{
    prev=prev.next;
    i++;
}
prev.next=prev.next.next;
return ;

}
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"=>");
            temp=temp.next;
        }
        System.out.print("null");
    }

    

    public static void main(String[] args) {
        Linkedlist ll =new Linkedlist();
        // ll.addFirst(10);
        // ll.addFirst(20);
        // ll.addFirst(30);
        // ll.addMiddle(9, 0);
        for(int i=10;i>0;i--){
            ll.addFirst(i);
        }
        // ll.removeFirst();
        // ll.removeLast();
        ll.printList();
        

        System.out.println("the size:"+ll.size);
        System.out.println(ll.itrSearch(5));
        System.out.println("the key:"+ll.recSearch(5));
        //ll.reverseList();
        ll.printList();
        ll.deleteNthfromEnd(6);
        ll.printList();


        
        
    }
}