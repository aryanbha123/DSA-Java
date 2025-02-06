package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root = null;

    Node insertion(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (root.data > data) {
            root.right = insertion(root.right, data);
        } else if (root.data < data) {
            root.left = insertion(root.left, data);
        }
        return root;

    }

    public void insert(int data) {
        root = insertion(root, data);
    }

    public void show() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp == null) {
                System.out.println(); 
                if (!q.isEmpty()) {
                    q.add(null); 
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.right != null) {
                    q.add(temp.right);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                
            }
        }
    }    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // System.out.println(bst.root);
        // bst.root = bst.insertion(bst.root, 1);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            bst.insert(n);
        }

        bst.show();
    }
}
