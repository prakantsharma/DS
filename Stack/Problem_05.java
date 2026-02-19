// Next greater element
import java.util.*;
public class Problem_05{
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int [] nextGreater=new int[arr.length];

        for(int i=arr.length-1;i>0;i--){
            // while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // if-else
                if(s.isEmpty()){
                    nextGreater[i]=-1;
                }else{
                    nextGreater[i]=arr[s.peek()];

                }
           //push in stack
           s.push(i);
        }
        for(int el:nextGreater)
        {
            System.out.print(el+" ");
        }


    }
}