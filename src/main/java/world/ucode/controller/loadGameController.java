package world.ucode.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import world.ucode.DataBase.DataBase;
import world.ucode.peppes.Peppes;
import world.ucode.scenes.GamePlay;
import world.ucode.scenes.MainMenu;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class loadGameController extends Controller{
    public loadGameController(Stage primaryStage) {
        super(primaryStage);
    }

//    @FXML
//    private ChoiceBox<String> HandleChoiseBox;
//
//    @FXML
//    void HandleBack(MouseEvent event) {
//        MainMenu menu = new MainMenu(primaryStage);
//    }
//
//    @FXML
//    void HandleLoad(MouseEvent event) {
//        String selectedChoice = HandleChoiseBox.getSelectionModel().getSelectedItem();
//        ResultSet resSet;
//        try {
//            resSet = DataBase.ReadDBAvatar(selectedChoice);
//            GamePlay game = new GamePlay(primaryStage, new Peppes(resSet));
//        }
//        catch (ClassNotFoundException | SQLException e) {
//            System.err.println("SQLException Load Game");
//        }
//    }
//
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ResultSet resSet;
        try {
            resSet = DataBase.ReadDBNames();
            List<String> names = new ArrayList<String>();
            while (resSet.next())
                names.add(resSet.getString("name"));
            ObservableList<String> availableChoices = FXCollections.observableArrayList(names);
            HandleChoiseBox.setItems(availableChoices);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private ChoiceBox<String> HandleChoiseBox;

    @FXML
    void HandleBack(MouseEvent event) {
        MainMenu menu = new MainMenu(primaryStage);
    }

    @FXML
    void HandleLoad(MouseEvent event) {
        String selectedChoice = HandleChoiseBox.getSelectionModel().getSelectedItem();
        ResultSet resSet;
        try {
            resSet = DataBase.ReadDBAvatar(selectedChoice);
            GamePlay game = new GamePlay(primaryStage, new Peppes(resSet));
        }
        catch (ClassNotFoundException | SQLException e) {
            System.err.println("SQLException Load Game");
        }
    }

}

