 public class  Mergesort
{
    public static void merge(int [] arr, int st,int mid,int end){
        int temp[]=new int[end-st+1];
        int i=st; // iterator for left part
        int j=mid+1 ; // for right part
        int k=0; // for temp array
        while(i<=mid && j<=end){
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i];
            i++;
        }
        while(j<=end){
            temp[k++]=arr[j];
            j++;
        }
        // copy temp to original array
        for(k=0;k<temp.length;k++){
            arr[st+k]=temp[k];

        }


    }
    public static void mergeSort(int [] arr,int st,int end){
        if(st>=end){
            return ;
        }
        int mid=st+(end-st)/2;
        // left part 
        mergeSort(arr, st, mid);

        // right part
        mergeSort(arr, mid+1, end);

        merge(arr,st,mid,end);
        
    }
    public static void main(String[] args) {
        int [] arr={2,5,1,6,9};
        mergeSort(arr,0,arr.length-1);
        for(int el:arr){
            System.out.print(el+" ");
        }
        
    }
}