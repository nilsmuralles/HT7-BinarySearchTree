package test;

/**
 * @author Nils Muralles Morales
 * @since 18/03/24
 * Tests para el árbol binario
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import src.BinaryTree;

public class BinaryTreeTest {
    
    /**
     * Test 1: Insertar valores
     */
    @Test
    public void testInsert() {
        BinaryTree<String, String> myTree = new BinaryTree<String, String>();
        myTree.insert("Tree", "Árbol");
        myTree.insert("Apple", "Manzana");
    }

    /**
     * Test 2: Insertar valores duplicados devuelve una excepción
     */
    @Test
    public void testInsertDuplicatedValue() {
        BinaryTree<String, String> myTree = new BinaryTree<String, String>();
        myTree.insert("Tree", "Árbol");
        myTree.insert("Pineapple", "Piña");
        myTree.insert("Apple", "Manzana");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> myTree.insert("Apple", "Manzana"));
        assertEquals("Duplicated value: Cannot repeat values in Binary Tree", exception.getMessage());
    }

    /**
     * Test 3: La búsqueda funciona correctamente
     */
    @Test
    public void testLookingForAWord() {
        BinaryTree<String, String> myTree = new BinaryTree<String, String>();
        myTree.insert("Tree", "Arbol");
        myTree.insert("Apple", "Manzana");
        myTree.insert("Dog", "Perro");
        assertEquals("Perro", myTree.search("Dog"));
    }
 
}