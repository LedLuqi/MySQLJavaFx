import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @FXML
    private AnchorPane mainPane;

    public void start(Stage primaryStage) throws Exception {
        mainPane = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }

    public void goToWorker (){
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("Worker.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add((Parent)anchorPane);

    }

    public void goToBoss (){
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("Boss.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainPane.getChildren().clear();
        mainPane.getChildren().add((Parent)anchorPane);

    }
}
