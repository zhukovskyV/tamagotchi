package world.ucode.scenes;

import javafx.stage.Stage;
import world.ucode.controller.gameOverController;
import world.ucode.peppes.Peppes;

public class GameOver extends GameScene {
    public GameOver(Stage primaryStage) {
        super(primaryStage, "/GameOver.fxml", new gameOverController(primaryStage));
    }
}