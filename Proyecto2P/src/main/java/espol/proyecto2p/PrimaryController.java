package espol.proyecto2p;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
