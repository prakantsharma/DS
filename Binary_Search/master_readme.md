# 🔎 Binary Search

> Efficient searching algorithm for sorted arrays using divide and conquer approach.

---

## 📌 Overview

Binary Search is a fast searching algorithm that works on **sorted arrays**.  
Instead of checking every element, it repeatedly divides the search space in half.

⚠️ **Note:** The array must be sorted before applying Binary Search.

---

## 🚀 How It Works

1. Find the middle element of the array.
2. Compare it with the target value.
3. If equal → return index.
4. If target is smaller → search left half.
5. If target is greater → search right half.
6. Repeat until found or search space becomes empty.

---

## 🧠 Algorithm (Iterative)


```
BinarySearch(arr, key):
low = 0
high = length(arr) - 1
while low <= high:
    mid = low + (high - low) // 2

    if arr[mid] == key:
        return mid
    else if key < arr[mid]:
        high = mid - 1
    else:
        low = mid + 1

return -1


⏱️ Time Complexity
Case	Complexity
Best Case	O(1)
Average Case	O(log n)
Worst Case	O(log n)

📦Space Complexity

Iterative: O(1)

Recursive: O(log n)

✅ Advantages

Very fast for large datasets

Efficient (logarithmic time)

Simple to implement

❌ Limitations

-Works only on sorted data
-Not suitable for linked lists
-Sorting may add extra cost

📌 Applications

-Searching in databases
-Competitive programming
-Finding lower/upper bounds
-Searching in rotated sorted arrays
-Binary search on answer problem