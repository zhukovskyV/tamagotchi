package world.ucode.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class gamePlayController extends Controller{

    public gamePlayController(Stage primaryStage) {
        super(primaryStage);
    }

        @FXML
        void hadlePlay() {
            System.out.println("<---you make your peppe more happy--->");
        }

        @FXML
        void handleClean() {
            System.out.println("<---you clean up peppe--->");
        }

        @FXML
        void handleDrugs() {
            System.out.println("<---you give drugs peppe--->");
        }

        @FXML
        void handleFeed() {
            System.out.println("<---you give eat for peppe--->");
        }

        @FXML
        void handleWater() {
            System.out.println("<---you give watter your peppe--->");
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

