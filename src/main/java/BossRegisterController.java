import BackEnd.BossParameters;
import BackEnd.Loggin_Register;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class BossRegisterController {
    @FXML
    private AnchorPane pane;
    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    private Text title;
    @FXML
    private Text info;

    public void buttonAction() {

        if (login.getText().toCharArray().length != 0 && password.getText().toCharArray().length != 0) {
            System.out.println(login.getText().toCharArray().length);
            Loggin_Register loggin_register = new Loggin_Register();
            BossParameters boss = new BossParameters(login.getText(), password.getText());
            loggin_register.saveBossToDAO(boss);
            info.setText("Registration Succesfull");
        } else {
            info.setText("Fill in the missing fields");
        }
    }

    public void undo() {
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(anchorPane);
    }

}
