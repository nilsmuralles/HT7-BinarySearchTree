package src;

/**
 * @author Nils Muralles
 * @since 18/03/24
 * @description Clase árbol binario que implementa la inserción y la búsqueda
 */

public class BinaryTree<K extends Comparable<K>, V> {
    private Node<Association<K, V>> root;
 
    /**
     * Constructor del Binary Tree
     */
    public BinaryTree() {}

    /**
     * Método que inserta un nuevo objeto en base a su clave y su valor (Para usuario)
     * @param key Clave
     * @param value Valor 
     */
    public void insert(K key, V value) {
       insert(root, new Association<>(key, value));
    }

    /**
     * Método privado que inserta una asociación a un nodo (interno)
     * @param current Nodo actual
     * @param association Asociación que se va a insertar
     */
    private void insert(Node<Association<K,V>> current, Association<K, V> association) {
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

        } else if (association.compareTo(current.getValue()) == -1 || association.compareTo(current.getValue()) == 0) {
            if (current.getLeft() != null) {
                insert(current.getLeft(), association);
            } else {
                current.setLeft(new Node<Association<K,V>>(association));
            }
        }
    }

    /**
     * Método de búsqueda en base a una clave (para usuario)
     * @param key Clave que se busca
     * @return Valor de la clave
     */
    public V search(K key) {
        return search(root, key);
    }

    /**
     * Método privado que busca una clave en el nodo actual
     * @param current Nodo actual
     * @param key Clave que se busca
     * @return Valor de la clave
     */
    private V search(Node<Association<K,V>> current, K key) {
        Association<K,V> temp = new Association<K,V>(key, null);
        
        if (current.getValue().getKey().equals(key)) {
            return current.getValue().getValue();
        }

        if (temp.compareTo(current.getValue()) == 1) {
            if (current.getRight() != null) {
                return search(current.getRight(), key);
            }
        }

        if (temp.compareTo(current.getValue()) == -1 || temp.compareTo(current.getValue()) == 0) {
            if (current.getLeft() != null) {
                return search(current.getLeft(), key);
            }
        }

        return null;
    }
}
