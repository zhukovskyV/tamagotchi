package world.ucode;

import javafx.application.Application;
import javafx.stage.Stage;
import world.ucode.DataBase.DataBase;
import world.ucode.scenes.MainMenu;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
//        Parent root = FXMLLoader.load(getClass().getResource("/FXML/MainMenu.fxml"));
        try {
            DataBase.Conn();
            DataBase.CreateDB();
            primaryStage.setTitle("Tamagotchi---");
            MainMenu menu = new MainMenu(primaryStage);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            System.err.println("Exception");
        }
    }
}
