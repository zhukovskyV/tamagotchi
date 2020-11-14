package world.ucode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import world.ucode.scenes.MainMenu;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
//        Parent root = FXMLLoader.load(getClass().getResource("/FXML/MainMenu.fxml"));
        try {
            primaryStage.setTitle("Tamagotchi---");
            MainMenu menu = new MainMenu(primaryStage);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            System.err.println("Exception");
        }
    }
}
