import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class BossController {
    @FXML
    AnchorPane pane;

    public void loginChoice () {
        AnchorPane login = null;
        try {
            login = FXMLLoader.load(getClass().getResource("BossLogin.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(login);

    }
}
