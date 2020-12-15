package world.ucode.scenes;

import javafx.stage.Stage;
import world.ucode.controller.gamePlayController;
import world.ucode.controller.gameMenuController;
import world.ucode.peppes.Peppes;

public class GamePlay extends GameScene {
    public GamePlay(Stage primaryStage, Peppes peppes) {
        super(primaryStage, "/GamePlay.fxml", new gamePlayController(primaryStage, peppes));
    }
}
