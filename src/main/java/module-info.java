module eu.andreatt.ejercicioi_dein {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens eu.andreatt.ejercicioi_dein.controller to javafx.fxml;
    opens eu.andreatt.ejercicioi_dein.application to javafx.graphics;

    exports eu.andreatt.ejercicioi_dein.application;
}
