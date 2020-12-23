package world.ucode.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import world.ucode.scenes.MainMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class gameOverController extends Controller {
    public gameOverController(Stage primaryStage) {
        super(primaryStage);
    }
    @FXML
    void mainMenuButton(ActionEvent event) {
        MainMenu menu = new MainMenu(primaryStage);
    }

    @FXML
    void quitButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


