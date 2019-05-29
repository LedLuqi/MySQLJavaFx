import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.awt.*;

public class WorkerLoginController {
    @FXML
    AnchorPane pane;
    @FXML
    TextField login;
    @FXML
    TextField password;
    @FXML
    Text passinfo;


    public void loginConfirm() {
        String LOG = login.getCharacters().toString();
        String PAS = password.getCharacters().toString();
        passinfo.setText("   Bajtlu Gorola");
    }
}
