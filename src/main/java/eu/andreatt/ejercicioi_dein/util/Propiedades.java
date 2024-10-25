package eu.andreatt.ejercicioi_dein.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Clase para leer las propiedades del sistema, urls, idioma instalado, directorios...
 */
public class Propiedades {

    private static final Properties props = new Properties();

    static {
        // Carga el archivo de propiedades desde el classpath
        try (InputStream input = Propiedades.class.getResourceAsStream("/eu/andreatt/ejercicioi_dein/configuration.properties")) {
            if (input == null) {
                throw new RuntimeException("No se encontró el archivo configuration.properties en el classpath.");
            }
            props.load(input);
        } catch (Exception e) {
            System.out.println("Error al cargar el archivo de propiedades: " + e.getMessage());
        }
    }

    /**
     * Obtiene el valor asociado a una clave desde el archivo de propiedades situado en el classpath.
     *
     * @param clave La clave cuyo valor se desea obtener.
     * @return El valor asociado a la clave.
     * @throws java.lang.RuntimeException Si el archivo de configuración no existe o la clave no tiene un valor asociado.
     */
    public static String getValor(String clave) {
        System.out.println("Leyendo clave: " + clave);
        String valor = props.getProperty(clave);
        if (valor != null) {
            return valor;
        }
        throw new RuntimeException("No he logrado leer esa clave en concreto");
    }
}
