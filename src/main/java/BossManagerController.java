import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;

public class BossManagerController {
    @FXML
    AnchorPane anchorPane;

    public void buttonActionCreateWorker (){
        AnchorPane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("WorkerRegister.fxml"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        anchorPane.getChildren().clear();
        anchorPane.getChildren().add(pane);
    }

    public void buttonActionCreateRequest () {}

    public void logout () {
        AnchorPane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        anchorPane.getChildren().clear();
        anchorPane.getChildren().add(pane);

    }

}
