import java.util.Scanner;

// Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Binary Tree class
class BinaryTree {
    Node root;
    Scanner sc = new Scanner(System.in);

    // Create method (recursive)
    Node create() {
        System.out.print("Enter data (-1 for no node): ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node newNode = new Node(data);

        System.out.println("Enter left child of " + data);
        newNode.left = create();

        System.out.println("Enter right child of " + data);
        newNode.right = create();

        return newNode;
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal
    void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal
    void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Create tree
        tree.root = tree.create();

        // Display
        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
    }
}