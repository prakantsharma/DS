package Sorting_Algorithms.CountingSort;
public class Countingsort
{
    public static void countingSort(int [] arr)
    {
        int largest=Integer.MIN_VALUE;
        for(int el:arr){
            largest=Math.max(el, largest);
        }
        int [] count=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            while(count[i]>0){
                arr[j]=i;
                j++;count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={1,4,1,3,2,4,3,7};
        countingSort(arr);
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
}