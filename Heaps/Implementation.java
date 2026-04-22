import java.util.*;
public class Implementation{
public static void main(String[] args)
{
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    // to print the elements in reverse order 
    // use comparator.reverseorder()
    
    pq.add(10); //(O(logn))
    pq.add(18);
    pq.add(5);
    pq.add(2);
    pq.add(40);
    
    while(!pq.isEmpty())
    {
        System.out.print(pq.peek()+" ");
        pq.remove(); // O(logn)
    }


}
}