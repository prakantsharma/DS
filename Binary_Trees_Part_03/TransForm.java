public class TransForm{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
           
    this.data = data;
    this.left = null;
    this.right = null;
}
        

        public int transform(Node root){
    if(root == null){
        return 0;
    }

    int leftSum = transform(root.left);
    int rightSum = transform(root.right);

    int oldValue = root.data;

    root.data = leftSum + rightSum;

    return root.data + oldValue;
}

        public void preOrder(Node root){
            if(root == null){
                return ;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

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
        root.transform(root);
        root.preOrder(root);
    }
}
