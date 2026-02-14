


public class Binarysearch

{
    public static int binarySearch(int [] arr,int key)
    {
        int st=0,end=arr.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key){ 
                // search in right half
                st=mid+1;

            }
            else{ // search in left half
                end=mid-1;
            }
        }
        // index not found 
        return -1; 
    }
    public static void main(String[] args) {
        int [] arr={2,5,7,8,9,11,21};
        int target=9;
        int index=binarySearch(arr,target);
        System.out.println("index found at index:"+index);


    }
}