import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

    static int index = -1;
    public static Node buildTree(int[] nodes){
        index++;
        if(nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node currentNode = queue.remove();
            if (currentNode == null){
                System.out.println();
                if (queue.isEmpty()){
                    break;
                } else{
                    queue.add(null);
                }
            } else{
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }

    }

    public static int countNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int heightOfTree(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diam3, Math.max((diam1), (diam2)));
    }

    static class TreeInfo{
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

        public static TreeInfo diameter2(Node root){
            if (root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.ht, right.ht) + 1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int myDiam = Math.max(diam3, Math.max((diam1), (diam2)));

            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }
    }

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);
//        levelOrder(root);
//        System.out.println(countNodes(root));
//        System.out.println(sumOfNodes(root));
//        System.out.println(heightOfTree(root));
//        System.out.println(diameter(root));
        System.out.println(TreeInfo.diameter2(root).diam);
    }
}