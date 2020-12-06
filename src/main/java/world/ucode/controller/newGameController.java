package world.ucode.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import world.ucode.scenes.GamePlay;
import world.ucode.scenes.MainMenu;
import world.ucode.scenes.NewGame;

import java.net.URL;
import java.util.ResourceBundle;

public class newGameController extends Controller {
    public newGameController(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    TextField NormalPeppe;

    @FXML
    TextField ClownPeppe;

    String name;

    @FXML
    private void HandleBadMan() {
        System.out.println("<-----------------Its Feels Bad Man-------------------->");
        name = NormalPeppe.getText();
       if (name.length() != 0) {
           System.out.println("Create Normal PEPPE " + name);
           GamePlay scene = new GamePlay(primaryStage);
       }
    }

    @FXML
    void handleClown() {
        System.out.println("<--------------------This is Clown--------------------->");
        name = ClownPeppe.getText();
        if (name.length() != 0) {
            System.out.println("Create Clown PEPPE " + name);
            GamePlay scene = new GamePlay(primaryStage);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
