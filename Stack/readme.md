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