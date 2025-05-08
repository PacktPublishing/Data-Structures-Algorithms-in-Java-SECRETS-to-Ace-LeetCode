import java.util.ArrayList;

public class BST {

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

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (val < root.data){
            // left subtree
            root.left = insert(root.left, val);
        }
        else // val > root.data
        {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int target){
        if (root == null) {
            return false;
        }
        if (target < root.data){
            // search in left subtree
            return search((root.left),target);
        } else if (root.data == target) {
            return true;
        }
        else // target > root.data
        {
            return search(root.right, target);
        }
    }

    public static Node delete(Node root, int val){
        if (val < root.data){
            root.left = delete(root.left,val);
        }
        else if(val > root.data){
            root.right = delete(root.right, val);
        } else{ // root.data == val
            // scenario 1: No children
            if(root.left == null && root.right == null){
                return null;
            }

            // scenario 2: One child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            // scenario 3: Two children
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete((root.right),IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(X <= root.data && root.data <= Y){
            printInRange(root.left,X,Y);
            System.out.print(root.data + " ");
            printInRange(root.right,X,Y);
        } else if(root.data >= Y){
            printInRange(root.left,X,Y);
        }
        else{
            printInRange(root.right,X,Y);
        }
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);

        // leaf
        if(root.left == null && root.right == null){
            printPath(path);
        } else{ // non-leaf
            printRootToLeaf(root.left,path);
            printRootToLeaf(root.right,path);
        }
        path.remove((path.size()-1));
    }

    private static void printPath(ArrayList<Integer> path) {
        for (int i=0; i < path.size(); i++){
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] values = {8,5,3,1,4,6,10,11,14};
        int[] values = {8,5,3,6,10,11,14};
        Node root = null;

        for (int i=0; i< values.length; i++){
            root = insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();

//        if (search(root, 9)) {
//            System.out.println("Target found in tree :)");
//        } else{
//            System.out.println("Target not found in tree :(");
//        }

//        delete(root,5);
//        inOrder(root);

//        printInRange(root,5,11);
        printRootToLeaf(root, new ArrayList<>());
    }
}