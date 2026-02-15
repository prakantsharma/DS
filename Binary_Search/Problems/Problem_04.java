// single element in a sorted array
public class Problem_04
{
    public static int singleElement(int [] a)
    {   if(a.length==1){
        return a[0];
    }
        int i=0,j=a.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(mid==0 && a[0]!=a[1]){
                return a[mid];
            }
            if(mid==a.length-1 && a[mid-1]!=a[mid]){
                return a[mid];
            }
            if(a[mid]!= a[mid+1] && a[mid-1]!=a[mid]){
                return a[mid];
            }
            if(mid%2==0){
            if(a[mid-1]==a[mid]){
                i=mid+1;
            }else{
                // `j=mid;` is updating the value of `j` to be equal to the current `mid` index. This
                // is done in the binary search algorithm to adjust the search range for the next
                // iteration.
                j=mid;
            }

            }else{
                if(a[mid-1]==a[mid]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int [] nums={1,1,2,2,3,4,4,8,8};
    int element=singleElement(nums);
    System.out.println("the single element is :"+element);

}
}