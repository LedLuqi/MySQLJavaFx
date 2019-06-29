import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class BossController {
    @FXML
    private AnchorPane pane;

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

    public void registerChoice () {
        AnchorPane register = null;
        try {
            register = FXMLLoader.load(getClass().getResource("BossRegister.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(register);

    }
}
