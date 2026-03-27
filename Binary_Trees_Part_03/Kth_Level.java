

public class Kth_Level{
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            this.left=this.right=null;
        }
        public void kth_Level(Node root,int level,int k){
            if(root==null){
                return ;
            }
            if(level==k){
                System.out.print(root.val+" ");
            }
            kth_Level(root.left, level+1, k);
            kth_Level(root.right, level+1, k);

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
       root.kth_Level(root, 1, 2);
        
        
    }
}