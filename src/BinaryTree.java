package src;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
 
    public BinaryTree() {}

    public void insert(T value) {
       insert(root, value);
    }

    public void insert(Node<T> current, T value) {
        if (current == null) {
            root = new Node<T>(value);
            return;
        }

        if (value.compareTo(current.getValue()) == 1) {
            if (current.getRight() != null) {
                insert(current.getRight(), value);
            } else {
                current.setRight(new Node<T>(value));
            }

        } else if (value.compareTo(current.getValue()) == -1) {
            if (current.getLeft() != null) {
                insert(current.getLeft(), value);
            } else {
                current.setLeft(new Node<T>(value));
            }
        }
    }
}
