/**
 * This Java class implements a method to find the peak element in a mountain array using binary
 * search.
 */
// The comment `// peak index in a mountain array` is a description or a note provided in the code to
// indicate the purpose or context of the class or method that follows. In this case, it suggests that
// the class or method is related to finding the peak element in a mountain array using binary search.
// It serves as a brief explanation for anyone reading the code to understand the functionality or
// objective of the code snippet that follows.
// peak index in a mountain array
public class Problem_03
{
    public static int findPeak(int [] a)
    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid-1]<a[mid] && a[mid]>a[mid+1]) return a[mid];
            if(a[mid]<a[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int [] nums={0,3,8,9,10,5,2};
    int peak=findPeak(nums);
    System.out.println("the Peak elemet is :"+peak);
}
}