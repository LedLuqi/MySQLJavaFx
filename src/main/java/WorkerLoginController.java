import BackEnd.Loggin_Register;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.IOException;

public class WorkerLoginController {
    @FXML
    private AnchorPane pane;
    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    private Text passinfo;
    @FXML
    private Text info;


    public void loginConfirm() {
            if (login.getText().toCharArray().length != 0 && password.getText().toCharArray().length != 0){
                String LOG = password.getText();
                String PAS = password.getText();
                login.clear();
                password.clear();
                Loggin_Register loggin_register = new Loggin_Register();
                if (loggin_register.getWorkerFromDao(LOG,PAS)){
                    AnchorPane login = null;
                    try {
                        login = FXMLLoader.load(getClass().getResource("WorkerManager.fxml"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    pane.getChildren().clear();
                    pane.getChildren().add(login);
                }
                else{
                    info.setText("Incorrect Password or Login");

                }
            }
            else info.setText("Fill in the fields");
        }


    public void undo () {
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
