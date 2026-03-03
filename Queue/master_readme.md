# 📚 Queue -- Master README

## 📌 Introduction

A **Queue** is a linear data structure that follows the **FIFO (First In
First Out)** principle.\
The element inserted first is the first one to be removed.

Think of it like a line at a ticket counter 🎟️\
The person who comes first gets served first.

------------------------------------------------------------------------

## 🧠 Core Concept

Insertion happens at the **Rear**\
Deletion happens at the **Front**

------------------------------------------------------------------------

## ⚙️ Basic Operations

  Operation    Description
  ------------ ---------------------------------------------------
  enqueue(x)   Insert element `x` at the rear
  dequeue()    Remove element from the front
  peek()       View the front element
  isEmpty()    Check if queue is empty
  isFull()     Check if queue is full (for array implementation)

------------------------------------------------------------------------

## 🏗️ Types of Queue

1.  Simple Queue\
2.  Circular Queue\
3.  Priority Queue\
4.  Deque (Double Ended Queue)

------------------------------------------------------------------------

## 🖥️ Implementation Methods

### 1️⃣ Using Array

-   Fixed size
-   Can cause memory wastage
-   Needs circular logic for optimization

### 2️⃣ Using Linked List

-   Dynamic size
-   No overflow (until memory is full)
-   More flexible

------------------------------------------------------------------------

## 🧾 Example (Java Implementation -- Circular Array)

``` java
class Queue {
    int front, rear, size;
    int capacity;
    int array[];

    Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = capacity - 1;
        array = new int[capacity];
    }

    boolean isFull() {
        return (size == capacity);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void enqueue(int item) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    int dequeue() {
        if (isEmpty()) return -1;
        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
}
```

------------------------------------------------------------------------

## ⏱️ Time Complexity

  Operation   Time Complexity
  ----------- -----------------
  Enqueue     O(1)
  Dequeue     O(1)
  Peek        O(1)

------------------------------------------------------------------------

## 🌍 Real-World Applications

-   CPU Scheduling\
-   Printer Queue\
-   Call Center Systems\
-   Breadth First Search (BFS)\
-   Handling requests in servers

------------------------------------------------------------------------

## 🔁 Queue vs Stack

  Feature     Queue   Stack
  ----------- ------- -------
  Principle   FIFO    LIFO
  Insert      Rear    Top
  Delete      Front   Top

------------------------------------------------------------------------

## 🎯 Why Learn Queue?

-   Foundation for algorithms like BFS\
-   Used in Operating Systems\
-   Important for interviews\
-   Core concept in Data Structures

------------------------------------------------------------------------

## 🚀 Practice Ideas

-   Implement Circular Queue\
-   Implement Queue using Stack\
-   Reverse a Queue\
-   Solve Sliding Window Maximum

------------------------------------------------------------------------

## ✨ Final Words

Mastering **Queue** strengthens your understanding of: - Memory
management\
- Order-based processing\
- Algorithm flow

Keep practicing 🔥
