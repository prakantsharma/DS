public class Kth_Ancestor{
    static class Node{
        int val;
        Node left ,right;
        public Node(int val){
            this.val=val;
            this.left=this.right=null;
        }
        public int kthAncestor(Node root ,int  n, int k){
            if(root==null){
                return -1;
            }
            if(root.val==n) {
                return 0;

            }
            int ld=kthAncestor(root.left, n, k);
            int rd=kthAncestor(root.right, n, k);
            if(ld == -1 && rd==-1){
                return -1;
            }
            int max=Math.max(ld, rd);
            if(max+1==k){
                System.out.println(root.val); 
            }
            return max+1;



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
root.kthAncestor(root, 4, 1);
        
    }
}