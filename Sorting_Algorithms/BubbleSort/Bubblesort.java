public class Bubblesort{
    public static void bubbleSort(int [] a){
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        }
    }
    
    public static void main(String[] args) {
        int [] arr={9,2,1,3,4,6,5,7,8};
        bubbleSort(arr);
        for(int el:arr){
            System.out.print(el+"<");
            
        }


            
        }
    }
