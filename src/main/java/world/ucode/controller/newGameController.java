package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import world.ucode.peppes.PeppeType;
import world.ucode.peppes.Peppes;
import world.ucode.scenes.GamePlay;

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
    GamePlay gamePlay;

    @FXML
    private void HandleBadMan() {
        System.out.println("<-----------------Its Feels Bad Man-------------------->");
        name = NormalPeppe.getText();
       if (name.length() != 0) {
           gamePlay = new GamePlay(primaryStage, new Peppes(PeppeType.BADMAN, name));
       }
    }

    @FXML
    void handleClown() {
        System.out.println("<--------------------This is Clown--------------------->");
        name = ClownPeppe.getText();
        if (name.length() != 0) {
            System.out.println("Create Clown PEPPE " + name);
            gamePlay = new GamePlay(primaryStage, new Peppes(PeppeType.CLOWN, name));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
