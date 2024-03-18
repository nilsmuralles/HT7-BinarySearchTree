package test;

/**
 * @author Nils Muralles
 * @since 18/03/23
 * Test de la clase Association
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.Association;

public class AssociationTest {
    
    /**
     * Test: Comparar el tamaño de dos palabras en inglés
     */
    @Test
    public void testCompareTwoEnglishWords(){
        Association<String, String> firstWord = new Association<String, String>("House", "Casa");
        Association<String, String> secondWord = new Association<String, String>("Ball", "Pelota");
        assertEquals(firstWord.compareTo(secondWord), 1);
    }
}
