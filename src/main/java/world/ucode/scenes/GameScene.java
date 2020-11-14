package world.ucode.scenes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class GameScene {
    private Scene scene;
    public Parent panel;
    GameScene(Stage primaryStage, String path, Object Controller) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/" + path));
            loader.setController(Controller);
            panel = loader.load();
            scene = new Scene(panel, 600,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Scene getScene() {
        return scene;
    }
}
