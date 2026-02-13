

public class Insertionsort {
    public static void insertionSort(int [] a){
        int n=a.length;
        for(int i=0;i<n; i++) 
            {
                int curr=a[i];
                int prev=i-1;
                while(prev>=0 && a[prev]>curr){
                    a[prev+1]=a[prev];
                    prev--;
                }
                a[prev+1]=curr;
            }  
       
    }
  public static void main(String[] args) {
    int [] arr={5,3,2,4,1,0};
    insertionSort(arr);
    for(int el:arr){
        System.out.print(el+" ");
    }
  }  
}
