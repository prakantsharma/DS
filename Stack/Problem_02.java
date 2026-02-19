import java.util.*;
public class Problem_02{
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder ans=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            ans.append(curr);
        }
        return ans.toString();
        



    }
    public static void main(String[] args) {
        String str="prakant";
        String res=reverseString(str);
        System.out.println(res);
        
    }
}