public class LCA_01{
    static class Node{
        int data;
        Node left ,right;
        public Node(int val){
            this.data=val;
            this.left=this.right=null;
        }
        public Node lca2(Node root,int n1,int n2){
            if(root == null){
                return null;
            }
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }
            Node leftLca=lca2(root.left, n1, n2);
            Node rightLca=lca2(root.right, n1, n2);
            
            if(rightLca==null){
                return leftLca;
            }
            if(leftLca==null){
                return rightLca;
            }
            return root;
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
        System.out.println(root.lca2(root, 4, 6).data);

        
    }
}