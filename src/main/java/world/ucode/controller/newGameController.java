package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import world.ucode.scenes.NewGame;

import java.net.URL;
import java.util.ResourceBundle;

public class newGameController extends Controller {
    public newGameController(Stage primaryStage) {
        super(primaryStage);
    }
    @FXML
    private void HandleBadMan() {
        System.out.println("<-----------------Its Feels Bad Man-------------------->");
        NewGame scene = new NewGame(primaryStage);
    }

    @FXML
    private void HandleClown() {
        System.out.println("<--------------------This is Clown--------------------->");
    }


    @FXML
    Button badManBtn;
    @FXML
    Button clownBtn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
