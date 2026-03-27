import java.util.*;
public class LCA{
   static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            this.left=this.right=null;
        }
        public boolean getPath(Node root,int n,ArrayList<Node> path){
            if(root == null){
                return false;
            }
            path.add(root);
            if(root.val==n){
                return true;
            }
            boolean foundLeft=getPath(root.left,n , path);
            boolean foundRight=getPath(root.right,n,path);
            if(foundLeft || foundRight){
                return true;

            }
            path.remove(path.size()-1);
            return false;
        }
        public Node LcA(Node root ,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();
            getPath(root,n1,path1);
            getPath(root,n2,path2);
            int i=0;

            for(;i<path1.size() && i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
                
            }
            Node lca=path1.get(i-1);

            

            return lca;
           
        }
    }

    public static void main(String[] args) {
         Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=4,n2=5;
        System.out.println(root.LcA(root, n1, n2).val);
    }
}