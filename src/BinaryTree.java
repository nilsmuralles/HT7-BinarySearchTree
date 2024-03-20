package src;

public class BinaryTree<K extends Comparable<K>, V> {
    private Node<Association<K, V>> root;
 
    public BinaryTree() {}

    public void insert(K key, V value) {
       insert(root, new Association<>(key, value));
    }

    public void insert(Node<Association<K,V>> current, Association<K, V> association) {
        if (current == null) {
            root = new Node<Association<K,V>>(association);
            return;
        }

        if (current.getValue().getKey().equals(association.getKey())) {
            throw new IllegalArgumentException("Duplicated value: Cannot repeat values in Binary Tree");
        }

        if (association.compareTo(current.getValue()) == 1) {
            if (current.getRight() != null) {
                insert(current.getRight(), association);
            } else {
                current.setRight(new Node<Association<K,V>>(association));
            }

        } else if (association.compareTo(current.getValue()) == -1) {
            if (current.getLeft() != null) {
                insert(current.getLeft(), association);
            } else {
                current.setLeft(new Node<Association<K,V>>(association));
            }
        }
    }
}
