package espol.proyecto2p;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.scene.Node;


import java.io.IOException;

public class MenuPrincipalController {
    private Stage stage;
    private Scene scene;
    private Parent root;
   

    @FXML
    private Button buttonReportes;
    @FXML
    private Button buttonAjustes;

    @FXML
    void switchToReportes(ActionEvent event) throws IOException{
        App.switchScenes(event, "ReportesPartidas", 900, 500);
    }
    
    @FXML
    void switchToAjustes(ActionEvent event) throws IOException{
        App.switchScenes(event, "Ajustes", 500,500);
    }
    

}
