package world.ucode.controller;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public abstract class Controller implements Initializable {
    protected Stage primaryStage;
    public Controller(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
