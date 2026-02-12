🫧 Bubble Sort Algorithm
📌 Introduction

Bubble Sort is a simple comparison-based sorting algorithm.
It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

The process continues until the array is completely sorted.
``` java implementation 

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: Stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {5, 3, 8, 4, 2};

        bubbleSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



| Case         | Time Complexity              |
| ------------ | ---------------------------- |
| Best Case    | O(n) *(when already sorted)* |
| Average Case | O(n²)                        |
| Worst Case   | O(n²)                        |

#📦 Space Complexity

O(1) → In-place sorting algorithm (no extra space used)


