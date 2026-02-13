public class Quicksort{
    public static int partition(int [] arr,int low,int high)
    {
        int pivot=arr[high]; // choosing last element as pivot
        int i=low-1;  // index of smaller element

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                // swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        // place pivot at correct position 
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void quickSort(int [] arr,int low,int high)
    {
        if(low<high){
            int pivot=partition(arr,low,high);
            // left part
            quickSort(arr, low, pivot-1);
            // right part
            quickSort(arr, pivot, high);

            
        }

    }
    public static void main(String[] args) {
        int [] arr={5,7,4,2,1,0,3,6};
        quickSort(arr,0,arr.length-1);
        for(int el:arr){
            System.out.print(el+" ");
        }

    }
}