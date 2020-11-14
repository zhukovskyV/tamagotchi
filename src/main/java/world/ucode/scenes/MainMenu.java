package world.ucode.scenes;

import javafx.stage.Stage;
import world.ucode.controller.gameMenuController;


public class MainMenu extends GameScene {
    public MainMenu(Stage primaryStage) {
        super(primaryStage, "/MainMenu.fxml", new gameMenuController(primaryStage));
    }
}
