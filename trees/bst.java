import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class bst {
    Node root;

    Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.err.print(root.data + " ");
        }
    }

    void levelorder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            System.out.print(cur.data + " ");

            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);
        }
    }

}

class Main {
    public static void main(String[] args) {
        bst tree = new bst();
        int val[] = { 2, 4, 5, 3, 6, 9, 21 };
        for (int vals : val) {
            tree.root = tree.insert(tree.root, vals);
        }
        tree.inorder(tree.root);
        tree.preorder(tree.root);
        tree.postorder(tree.root);
    }
}
