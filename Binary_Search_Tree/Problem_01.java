public class Problem_01 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void printinRange(Node root,int k1,int k2){
        if(root==null) return ;
        if(root.data>=k1 && root.data <=k2){
            printinRange(root.left, k1, k2);
            System.out.println(root.data+" ");
            printinRange(root.right, k1, k2);

        }else if(root.data<k1){
            printinRange(root.right, k1, k2);
        }else{
            printinRange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        int[] values = {8,5,10,3,6,1,4,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]); 
        }

        inorder(root); 
        printinRange(root, 5, 12);
    }
}