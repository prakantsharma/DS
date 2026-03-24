import java.util.*;
public class Pre_Order{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class BinaryTree{
         static int idx=-1;
        public Node buildTree(int [] nodes){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
           

        }
        public void preOrder(Node root){
            // root-> left -> right
            if(root==null){
                System.out.print(-1+" ");
                return ;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }
        public void inOrder(Node root){
            // leftSubtree -> root -> rightSubtree
            if(root == null){
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);


        }
        public void postOrder(Node root){
            if(root == null){
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

        }
        public void levelOrder(Node root){
            if(root == null){
                return ;

            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);q.add(null);
            while(!(q.isEmpty())){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }

                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }


                }
            }

        }
        public int height(Node root){
            if(root == null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(rh, lh)+1;

        }

        public  int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int lc=countNodes(root.left);
            int rc=countNodes(root.right);
            int totalNodes=lc+rc+1;
            return totalNodes;

        }
        
        public int sum(Node root){
            if(root ==null){
                return 0;
            }
          // In the provided code snippet, the condition `if(root == -1)` is checking if the current
          // node being processed is a leaf node represented by the value `-1` in the input array
          // `nodes`. If the current node is a leaf node (i.e., its value is `-1`), the function
          // returns `0` to indicate that there is no value associated with this node in terms of sum
          // calculation. This check ensures that leaf nodes are not considered in the sum calculation
          // logic and are effectively treated as having a value of `0`.
           
    if (root == null) {  
        return 0;
    }

    return root.data + sum(root.left) + sum(root.right);
}

        }
    

    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("the root node of the tree is :"+root.data);
        // System.out.println("pre order traversal :");
        // tree.preOrder(root);
        // System.out.println();
        // System.out.println("inOrder traversal :");
        // tree.inOrder(root);
        // System.out.println();
        // System.out.println("postOrder traversal :");
        // tree.postOrder(root);
        tree.levelOrder(root);
        System.out.println("the height of the tree is :"+tree.height(root));
        System.out.println("the total nodes in the tree are :"+tree.countNodes(root));
        System.out.println("the sum of the nodes of the tree is :"+tree.sum(root));







    }
}