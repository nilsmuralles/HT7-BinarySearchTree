package test;

import org.junit.Test;
import src.Association;
import src.BinaryTree;

public class BinaryTreeTest {
    
    @Test
    public void testInsert() {
        BinaryTree<Association<String, String>> myTree = new BinaryTree<Association<String, String>>();
        myTree.insert(new Association<String,String>("Tree", "Árbol"));
        myTree.insert(new Association<String,String>("Apple", "Manzana"));
    }
 
}