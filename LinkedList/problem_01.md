 # detect a cycle/loop in a linked list
 ``` java implementation 

 public boolean hasCycle(Node head){
    Node slow=head;
    Node fast=head;
    while(fast != null && fast.next != null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
    
 }