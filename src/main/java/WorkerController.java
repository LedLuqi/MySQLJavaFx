import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class WorkerController {
    @FXML
    private AnchorPane pane;

    public void loginChoice () {
        AnchorPane login = null;
        try {
            login = FXMLLoader.load(getClass().getResource("WorkerLogin.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(login);

    }
}
