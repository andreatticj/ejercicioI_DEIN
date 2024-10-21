module eu.andreatt.ejercicioi_dein {
    requires javafx.controls;
    requires javafx.fxml;


    opens eu.andreatt.ejercicioi_dein to javafx.fxml;
    exports eu.andreatt.ejercicioi_dein;
}