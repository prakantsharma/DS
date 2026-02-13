public class Selectionsort{
    public static void selectionSort(int [] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
        for(int j=i+1;j<n;j++){
            if(a[j]<a[minPos]){
                minPos=j;
            }
        }
        int temp=a[minPos];
        a[minPos]=a[i];
        a[i]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,4,2,5,3,6,0};
        selectionSort(arr);
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
}