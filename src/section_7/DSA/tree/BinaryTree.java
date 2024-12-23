package section_7.DSA.tree;

/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class BinaryTree {

    Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        }

        if (data < root.data){
            root.left = insert(root.left, data);
        }

        if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void printInOrder() {
        inorder(root);
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
