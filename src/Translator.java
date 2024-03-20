package src;

/**
 * @author Nils Muralles
 * @sicne 19/03/24
 * @description Clase que se encarga de la traducción de las oraciones
 */

public class Translator {
    private Reader dictionaryReader;
    private BinaryTree<String, String> dictionary;

    /**
     * Constructor de translator
     */
    public Translator() {
        dictionaryReader = new Reader("diccionario.txt");
        this.dictionary = dictionaryReader.fillDictionary();
    }

    /**
     * Traduce un texto en inglés al español
     * @param englishText Texto en inglés 
     * @return texto en español
     */
    public String trasnlate(String englishText) {
        String[] words = englishText.toLowerCase().replaceAll("[,.]", "").split("\\s+");
        StringBuilder spanishText = new StringBuilder();

        for (String word : words) {
            String translatedWord = (dictionary.search(word) != null) ? dictionary.search(word) : "*" + word + "*";
            spanishText.append(translatedWord).append(" ");
        }

        return spanishText.toString().trim();
    }
}
