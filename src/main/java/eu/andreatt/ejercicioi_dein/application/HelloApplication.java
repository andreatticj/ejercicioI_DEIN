package eu.andreatt.ejercicioi_dein.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * La clase {@code HelloApplication} es la entrada principal de la aplicación JavaFX.
 * Extiende la clase {@code Application} y configura la interfaz gráfica cargando un archivo FXML.
 */
public class HelloApplication extends Application {

    /**
     * El método {@code start} es el punto de entrada de la aplicación JavaFX.
     * Carga la interfaz desde un archivo FXML y establece las dimensiones mínimas de la ventana.
     *
     * @param stage El escenario principal (ventana) de la aplicación.
     * @throws IOException Si no se puede cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Define el idioma que deseas utilizar
        Locale locale = new Locale("en"); // Cambia a "en" o "eus" según el idioma
        ResourceBundle bundle = ResourceBundle.getBundle("eu.andreatt.ejercicioi_dein.idiomas.messages", locale);


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/eu/andreatt/ejercicioi_dein/fxml/ejercicioI.fxml"),bundle);
        Scene scene = new Scene(fxmlLoader.load(), 500, 450);
        Image icon = new Image(getClass().getResourceAsStream("/eu/andreatt/ejercicioi_dein/images/agenda.png"));
        stage.getIcons().add(icon);
        scene.getStylesheets().add(getClass() .getResource("/eu/andreatt/ejercicioi_dein/css/styles.css").toExternalForm());
        stage.setMinHeight(300);
        stage.setMinWidth(350);
        String title = bundle.getString("window.title");
        stage.setTitle(title); // Título de la ventana
        stage.setScene(scene);
        stage.show(); // Mostrar la ventana
    }

    /**
     * El método {@code main} es el punto de entrada estándar para lanzar la aplicación JavaFX.
     * Llama al método {@code launch}, que es provisto por la clase {@code Application}.
     *
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
