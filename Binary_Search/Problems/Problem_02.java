/**
 * This Java class implements a binary search algorithm to find a target element in a rotated sorted
 * array.
 */
// Search in a rotated sorted Array.
public class Problem_02
{
    public static int search(int [] a,int key)
    {
    int low=0,high=a.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(a[mid]==key) return mid;
        if(a[low]<=a[mid]) // left half is sorted
        {
            if(a[low]<=key && key<= a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        else{
            if(a[mid]<=key && key<=a[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
    return -1;
    }
public static void main(String[] args) {
    int [] nums={3,4,5,6,7,0,1,2};
    int target=6;
    int index=search(nums,target);
    System.out.println("target found at index :"+index);
}
}