package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import src.BinaryTree;

public class BinaryTreeTest {
    
    @Test
    public void testInsert() {
        BinaryTree<String, String> myTree = new BinaryTree<String, String>();
        myTree.insert("Tree", "Árbol");
        myTree.insert("Apple", "Manzana");
    }

    @Test
    public void testInsertDuplicatedValue() {
        BinaryTree<String, String> myTree = new BinaryTree<String, String>();
        myTree.insert("Tree", "Árbol");
        myTree.insert("Pineapple", "Piña");
        myTree.insert("Apple", "Manzana");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> myTree.insert("Apple", "Manzana"));
        assertEquals("Duplicated value: Cannot repeat values in Binary Tree", exception.getMessage());
    }
 
}