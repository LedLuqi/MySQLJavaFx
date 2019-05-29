import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class BossLoginConroller {
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
        login.clear();
        String PAS = password.getCharacters().toString();
        password.clear();
        passinfo.setText("   Bajtlu Gorola");
    }
}
