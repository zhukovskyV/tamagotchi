package world.ucode.scenes;

import javafx.stage.Stage;
import world.ucode.controller.loadGameController;

public class LoadGame extends GameScene {
    public LoadGame(Stage primaryStage) {
        super(primaryStage, "/Untitled.fxml", new loadGameController(primaryStage));
    }
}