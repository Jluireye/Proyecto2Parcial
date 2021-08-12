module espol.proyecto2p {
    requires javafx.controls;
    requires javafx.fxml;

    opens espol.proyecto2p to javafx.fxml;
    exports espol.proyecto2p;
}
