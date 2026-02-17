# 📚 Stack Data Structure – Complete Guide

## 🧠 What is a Stack?

A **Stack** is a linear data structure that follows the principle of:

> **LIFO – Last In, First Out**

The last element inserted into the stack is the first one to be removed.

### Real-Life Example:
Imagine a stack of plates:
- You place a plate on top.
- You remove the top plate first.

---

## 🔑 Key Features

- Linear Data Structure
- Follows **LIFO**
- Insertion & Deletion happen at **one end (Top)**
- Efficient operations: **O(1)** for push & pop

---

## ⚙️ Basic Operations

| Operation | Description |
|-----------|------------|
| `push(x)` | Insert element `x` at top |
| `pop()` | Remove the top element |
| `peek()` / `top()` | Return top element without removing |
| `isEmpty()` | Check if stack is empty |
| `isFull()` | Check if stack is full (array implementation) |

---

## 🏗️ Implementation Methods

### 1️⃣ Array Implementation
- Uses fixed-size array
- Faster access
- Can cause **Stack Overflow**

### 2️⃣ Linked List Implementation
- Dynamic size
- No overflow (until memory is full)
- Uses extra memory for pointers

---

## 🔍 How Stack Works

### Push Operation
- Increment `top`
- Insert element at new `top`

### Pop Operation
- Return element at `top`
- Decrement `top`

### Example

push(10)
push(20)
push(30)

pop() → 30
peek() → 20

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
|------------|----------------|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |
| Search | O(n) |

### Space Complexity:  
`O(n)`

---

## 🚨 Stack Errors

- **Stack Overflow** → Pushing into a full stack
- **Stack Underflow** → Popping from an empty stack

---

## 💡 Applications of Stack

- Function calls & Recursion
- Undo/Redo functionality
- Expression Evaluation (Infix, Postfix, Prefix)
- Parenthesis Validation
- Backtracking Algorithms
- Browser History
- DFS (Depth First Search)

---

## 🧩 Common Interview Problems

- Reverse a String using Stack
- Valid Parentheses
- Next Greater Element
- Stock Span Problem
- Infix to Postfix Conversion
- Evaluate Postfix Expression

---


---

## 🎯 Why Learn Stack?

- Foundation of Data Structures
- Important for Coding Interviews
- Helps in understanding Recursion
- Frequently used in Competitive Programming

---

## 📌 Conclusion

The **Stack Data Structure** is simple yet powerful.  
Mastering it strengthens your problem-solving skills and builds a strong DSA foundation.

---

### ⭐ If you found this helpful, consider giving the repository a star!
Happy Coding 🚀


