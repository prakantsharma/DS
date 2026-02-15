/**
 * This Java class provides methods to find the lower bound and upper bound of an element in a sorted
 * array.
 */
// lower bound and upper bound of an element
public class Problem_01
{
    public static int lowerBound(int [] arr,int ele)
    { int n=arr.length;
        int st=0,end=n-1;
        while(st<end)
        {
            int mid=st+(end-st)/2;
            if(ele<=arr[mid]){
                end=mid;
            }
            else{
                st=mid+1;
            }

        }
        if(ele<arr[st] && st<n){
            st++;
        }
        return st;

    }
    
public static int upperBound(int[] arr, int ele) {
    int n = arr.length;
    int st = 0, end = n;

    while (st < end) {
        int mid = st + (end - st) / 2;
        if (arr[mid] <= ele) {
            st = mid + 1;
        } else {
            end = mid;
        }
    }
    return st;



    }
    public static void main(String[] args) {
        int [] arr={1,2,3,3,3,4,4,4,5};
        int ele=3;
        int lowerBound=lowerBound(arr,ele);
        int upperbound=upperBound(arr,ele);
        System.out.println("the lower bound of the element is :"+lowerBound);
        System.out.println("the upper bound of the element is :"+upperbound);


    }
}