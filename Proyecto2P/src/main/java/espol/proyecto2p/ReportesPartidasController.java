package espol.proyecto2p;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class ReportesPartidasController {

    @FXML
    void switchToMenu(ActionEvent event) throws IOException{
        App.setRoot("MenuPrincipal");
    }

}