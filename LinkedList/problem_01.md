# Detect Cycle in a Linked List

## Problem Statement
Given the head of a linked list, determine whether the list contains a cycle.

## Approach (Floyd’s Cycle Detection)
- Use two pointers: slow and fast
- Slow moves one step at a time
- Fast moves two steps at a time
- If a cycle exists, both pointers will meet

## Algorithm
1. Initialize slow and fast at head
2. Move slow by 1 and fast by 2
3. If slow equals fast → cycle exists
4. If fast reaches null → no cycle

## Java Implementation
```java
public boolean hasCycle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }
    return false;
}
