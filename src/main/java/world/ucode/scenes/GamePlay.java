package world.ucode.scenes;

import javafx.stage.Stage;
import world.ucode.controller.gamePlayController;
import world.ucode.controller.gameMenuController;

public class GamePlay extends GameScene {
    public GamePlay(Stage primaryStage) {
        super(primaryStage, "/GamePlay.fxml", new gamePlayController(primaryStage));
    }
}
