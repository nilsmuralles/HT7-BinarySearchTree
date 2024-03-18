package src;

/**
 * @author Nils Muralles
 * @since 18/03/24
 * @description Clase nodo para un árbol de búsqueda binaria
 */

public class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
    
    /**
     * Constructor del Nodo
     * @param value Valor del nodo
     */
    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     * Devuelve el valor 
     * @return Valor
     */
    public T getValue() {
        return value;
    }

    /**
     * Actualiza el valor
     * @param value Valor
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Devuelve el nodo a la izquierda
     * @return Nodo izquierdo
     */
    public Node<T> getLeft() {
        return left;
    }

    /**
     * Actualiza el nodo a la izquierda
     * @param left Nodo izquierdo
     */
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    /**
     * Devuelve el nodo a la derecha
     * @return Nodo derecho
     */
    public Node<T> getRight() {
        return right;
    }

    /**
     * Actualiza el nodo a la derecha
     * @param right Nodo derecho
     */
    public void setRight(Node<T> right) {
        this.right = right;
    }

}
