// Book Allocation Problem
public class BookAllocation {

    // Check if allocation is possible with maxPages limit
    public static boolean isValid(int[] arr, int n, int m, int maxPages) {

        int students = 1;   // Start with first student
        int pages = 0;

        for (int i = 0; i < n; i++) {

            // If a single book has more pages than maxPages
            if (arr[i] > maxPages) {
                return false;
            }

            // If current student can take this book
            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                // Assign to next student
                students++;
                pages = arr[i];

                if (students > m) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int bookAllocation(int[] arr, int n, int m) {

        if (m > n) return -1;

        int start = 0;
        int end = 0;

        // Lower bound = max element
        // Upper bound = sum of array
        for (int i = 0; i < n; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        int answer = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValid(arr, n, m, mid)) {
                answer = mid;
                end = mid - 1;   // Try to minimize further
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {12,34,67,90};
        int n = 4;
        int m = 2;

        int result = bookAllocation(nums, n, m);
        System.out.println("Minimum maximum pages = " + result);
    }
}
