package Tree.BinarySearchTree;

public class BSTByLinkedList {
    public static Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        } else if (root.data > newNode.data) {
            if (root.left == null) {
                root.left = newNode;
            } else {
                insert(root.left, newNode);
            }
        } else if (root.data < newNode.data) {
            if (root.right == null) {
                root.right = newNode;
            } else {
                insert(root.right, newNode);
            }
        }
        return root;
    }
    public static void preOrder(Node root) {
        if (root == null)
            return;
        else {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        else {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if (root == null)
            return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public boolean search(Node root, int data) {
        boolean result = false;
        if (root == null)
            return false;

        else if (root.data == data)
            return true;


        else if (root.data > data) {
            result = search(root.left, data);
        } else if (root.data < data) {
            result = search(root.right, data);
        }

        return result;
    }

    public static Node delete(Node root, int data) {
        if (root == null)
            return null;
        else if (data < root.data)
            root.left = delete(root.left, data);
        else if (data > root.data)
            root.right = delete(root.right, data);
        else {
            if (root.left == null || root.right == null) {
                Node temp;
                temp = root.left == null ? root.right : root.left;
                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {
                Node successor = getSuccessor(root);
                root.data = successor.data;
                root.right = delete(root.right, root.data);
                return root;
            }
        }
        return root;
    }

    public static Node getSuccessor(Node root){
        if(root == null){
            return null;
        }
        Node temp = root.right;
        while(temp.left != null){
            temp =temp.left;
        }
        return temp;
    }

    public static Node getPredecessor(Node root){
        if(root == null){
            return null;
        }
        Node temp = root.left;
        while(temp.right != null){
            temp =temp.right;
        }
        return temp;
    }
}
