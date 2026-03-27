public class MIN_DISTANCE {
    static class Node{
        int val;
        Node left , right;
        public Node(int val){
            this.val=val;
            Node left=right=null;
        }
        public Node lca2(Node root,int n1,int n2){
            if(root == null){
                return null;
            }
            if(root==null || root.val==n1 || root.val==n2){
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
        public int lcaDist(Node root,int n){
            if(root == null) return -1;
            if(root.val==n) return 0;
            int leftD=lcaDist(root.left, n);
            int rightD=lcaDist(root.right, n);
            if(leftD==-1 && rightD==-1){
                return -1;
            }
            else if(leftD==-1){
                return rightD+1;
            }
            else{
                return leftD+1;
            }

        }
        public int minDistance(Node root,int n1,int n2){
            Node lca=lca2(root, n1, n2);
            int d1=lcaDist(lca,n1);
            int d2=lcaDist(lca,n2);
            return d1+d2;
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
        System.out.println(root.minDistance(root, 4, 6));

        
    }
}
