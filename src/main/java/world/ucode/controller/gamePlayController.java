package world.ucode.controller;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import world.ucode.peppes.Peppes;
import world.ucode.peppes.PeppesInteraction;

import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;

public class gamePlayController extends Controller {
    Peppes peppes;
    Timeline LifeCycle;
    @FXML
    ImageView PeppeView;

    @FXML
    private ProgressBar healthBar;
    @FXML
    private ProgressBar happiestBar;
    @FXML
    private ProgressBar hungerBar;
    @FXML
    private ProgressBar thirstBar;
    @FXML
    private ProgressBar cleanlinessBar;

    public gamePlayController(Stage primaryStage, Peppes peppes) {
        super(primaryStage);
        this.peppes = peppes;
    }

    private void setProgress() {
        healthBar.setProgress(peppes.getHealth()/peppes.getMaxHealth());
        happiestBar.setProgress(peppes.getHappy()/ 10);
        hungerBar.setProgress(peppes.getHunger()/ 10);
        thirstBar.setProgress(peppes.getThirst()/10);
        cleanlinessBar.setProgress(peppes.getCleanliness()/10);
    }

    @FXML
    void hadlePlay() throws InvocationTargetException, IllegalAccessException {
        peppes.ActionHandler(PeppesInteraction.PLAY, peppes);
        System.out.println("<---you make your peppe more happy--->");
    }

    @FXML
    void handleClean() throws InvocationTargetException, IllegalAccessException {
        peppes.ActionHandler(PeppesInteraction.CLEAN_UP, peppes);
        System.out.println("<---you clean up peppe--->");
    }

    @FXML
    void handleDrugs() throws InvocationTargetException, IllegalAccessException {
        peppes.ActionHandler(PeppesInteraction.GIVE_DRUGS, peppes);
        System.out.println("<---you give drugs peppe--->");
    }

    @FXML
    void handleFeed() throws InvocationTargetException, IllegalAccessException {
        peppes.ActionHandler(PeppesInteraction.FEED, peppes);
        System.out.println("<---you give eat for peppe--->");
    }

    @FXML
    void handleWater() throws InvocationTargetException, IllegalAccessException {
        peppes.ActionHandler(PeppesInteraction.GIVE_WATER, peppes);
        System.out.println("<---you give watter your peppe--->");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}

