package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    Node root = null;

    public void display() {
        if (this.root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(this.root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    public Node insertion(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertion(root.left, data);
        } else if (data > root.data) {
            root.right = insertion(root.right, data);
        }
        return root;
    }

    public void insert(int data) {
        this.root = insertion(this.root, data);
    }

    public void preOrderMain(Node root) {
        if (root == null) {
            return;
        }
        preOrderMain(root.left);
        System.out.print(root.data + " ");
        preOrderMain(root.right);
    }

    public void preOrder() {
        preOrderMain(this.root);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] data = new int[] { 11, 22, 13, 34, 95, 16, 7, 28 };
        int i = 0;

        while (i < data.length) {
            tree.insert(data[i]);
            ++i;
        }

        // tree.display();
        tree.preOrder();
    }
}
