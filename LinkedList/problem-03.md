# Zig-Zag Linked List

**Problem:**  
Rearrange a singly linked list in zig-zag order.

**Example:**  
`1 → 2 → 3 → 4 → 5 → 6 → null`  
`1 → 6 → 2 → 5 → 3 → 4 → null`

**Approach:**  
1. Find the middle using slow–fast pointers  
2. Reverse the second half of the list  
3. Merge both halves alternately  

**Java Code:**
```java
public void zigZag() {

    Node slow = head;
    Node fast = head;

    // Find middle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    Node mid = slow;

    // Reverse second half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // Zig-zag merge
    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    while (left != null && right != null) {
        nextL = left.next;
        left.next = right;

        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }
}
