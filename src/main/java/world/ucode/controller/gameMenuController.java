package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import world.ucode.scenes.NewGame;

import java.net.URL;
import java.util.ResourceBundle;

public class gameMenuController extends Controller {
    public gameMenuController(Stage primaryStage){
        super(primaryStage);
    }

    @FXML
    private void HandleNewGame() {
        System.out.println("This is New Game");
        NewGame scene = new NewGame(primaryStage);
    }

    @FXML
    private void HandleLoadGame() {
        System.out.println("This is Load Game");
    }
    @FXML
    Button newGameBtn;

    @FXML
    Button loadGameBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
