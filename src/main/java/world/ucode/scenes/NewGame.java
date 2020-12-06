package world.ucode.scenes;

import javafx.stage.Stage;
import world.ucode.controller.newGameController;

public class NewGame extends GameScene {
    public NewGame(Stage primaryStage) {
        super(primaryStage, "/Selector.fxml", new newGameController(primaryStage));
    }
}
