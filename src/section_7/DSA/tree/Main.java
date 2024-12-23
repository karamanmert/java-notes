package section_7.DSA.tree;

/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.printInOrder();
    }
}
