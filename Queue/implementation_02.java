// this is the implementation of the Queue using linked list.
public class implementation_02{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public boolean isEmpty(){
            return head==null &&tail==null;
        }
        // adding the new elements 
        public void add(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        // remove 
        public int remove()
        {
          if(isEmpty()){
            System.out.println("queue is empty!!");
            return -1;
          } 
          int front=head.val;
          if(tail==head){
            tail=head=null;
          } else{
            head=head.next;
          }
          return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.val;
        }

    }

    public static void main(String[] args) {
        Queue q=new Queue();
        for(int i=0;i<5;i++){
            q.add(i);
        }
        while(!(q.isEmpty())){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
}