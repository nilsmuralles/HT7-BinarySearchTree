package src;

/**
 * @author Nils Muralles
 * @since 18/03/24
 * @description Clase que asocia una palabra en inglés con su traducción literal en español
 */

public class Association<K extends Comparable<K>, V> implements Comparable<Association<K,V>>{
    private K key;
    private V value;

    /**
     * Constructor de Association
     * @param key Clave: Palabra en inglés
     * @param value Valor: Palabra en espaañol
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Devuelve la clave
     * @return Clave: Palabra en inglés
     */
    public K getKey() {
        return key;
    }

    /**
     * Actualiza la clave
     * @param key Clave: Palabra en inglés
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Devuelve el valor
     * @return Valor: Palabra en español
     */
    public V getValue() {
        return value;
    }

    /**
     * Actualiza el valor
     * @return Valor: Palabra en español
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * Compara la clave de la asociación con la clave de otra asociación en función de su longitud
     * @param association Asosciación con la que se desea comparar
     * @return Resultado de .compare()
     */
    @Override
    public int compareTo(Association<K, V> association) {
        return Integer.compare(key.toString().length(), association.getKey().toString().length());
    }
    
}