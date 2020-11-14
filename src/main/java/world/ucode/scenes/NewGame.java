package world.ucode.scenes;

import javafx.stage.Stage;
import world.ucode.controller.gameMenuController;

public class NewGame extends GameScene {
    public NewGame(Stage primaryStage) {
        super(primaryStage, "/selector.fxml", new gameMenuController(primaryStage));
    }
}
