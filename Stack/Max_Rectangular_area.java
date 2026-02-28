import java.util.*;
public class Max_Rectangular_area
{
    public static void maxArea(int [] arr)
    {
        int ans=0;
        int n=arr.length;
        int [] nsr=new int[n];
        int [] nsl=new int[n];
        Stack<Integer> s=new Stack<>();
        // next smaller right
        for(int i=n-1;i>0;i--){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);

        }
        // next smaller left
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);

        }
        // current area
        for(int i=0;i<n;i++)  
        {
            int h=arr[i];
            int w=nsr[i]-nsl[i]-1;
            int currArea=h*w;
            ans=Math.max(currArea, ans);
        }
        System.out.println("the max area is :"+ans);

    }
public static void main(String[] args) {
    int [] arr={2,4};
    maxArea(arr);
}
}
