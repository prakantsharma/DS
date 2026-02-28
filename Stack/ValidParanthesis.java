import java.util.*;
public class ValidParanthesis {
    public static boolean isValid(String str)
    { int n=str.length();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<n;i++)  
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{'|| ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()) return false;
                if((s.peek()=='(' && ch==')' ) ||
                (s.peek()=='{' && ch=='}')||
                (s.peek()=='[' && ch==']'))
                    { s.pop();

                } else{
                    return false;
                }
            }
        }
        return s.isEmpty();


    }
    public static void main(String[] args) {
        String str="({}[]";
        System.out.println(isValid(str));


    }
    
}
