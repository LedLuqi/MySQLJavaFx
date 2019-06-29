import BackEnd.Boss;
import BackEnd.typeOfWorker;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class WorkerRegisterController {

    @FXML
    AnchorPane pane;
    @FXML
    TextField name;
    @FXML
    TextField surname;
    @FXML
    TextField login;
    @FXML
    TextField password;
    @FXML
    TextField age;
    @FXML
    TextField workerType;
    @FXML
    TextField info;

    public void buttonAction (){
        if (name == null || surname == null || login == null || password == null || age == null ){
            info.clear();
            info.appendText("Fill in the missing fields");
        }
        else {
            typeOfWorker type = null;
            if (workerType.getText() == "Tiler")
                type = typeOfWorker.TILER;
            if (workerType.getText() == "Carpenter")
                type = typeOfWorker.CARPENTER;
            if (workerType.getText() == "Bricklayer")
                type = typeOfWorker.BRICKLAYER;

            Boss boss = new Boss();
            boss.createWorker(type , name.getText(), surname.getText(), login.getText(), password.getText(), 5);
            boss.register();
            info.clear();
            info.appendText("Registration Succesfull");
        }
    }

    public void back () {
        AnchorPane login = null;
        try {
            login = FXMLLoader.load(getClass().getResource("BossManager.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pane.getChildren().clear();
        pane.getChildren().add(login);
    }


}
