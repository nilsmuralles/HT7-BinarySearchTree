package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private File file;

    /**
     * Constructor de clase
     * @param fileName Nombre del archivo a leer
     */
    Reader(String fileName) {
        file = new File(fileName);
    }

    
    /**
     * Llena el diccionario
     * @return Árbol binario con las palabras en inglés y en español
     */
    public BinaryTree<String, String> fillDictionary() {
        BinaryTree<String, String> dictionary = new BinaryTree<String, String>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            String line;
            while ((line = br.readLine()) != null) {
                String[] pair = line.replaceAll("[()]", "").split(",");
                dictionary.insert(pair[0], pair[1]);
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return dictionary;
    }
}
