package world.ucode.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.util.Duration;
import world.ucode.peppes.PeppeAnimation;
import world.ucode.peppes.Peppes;
import world.ucode.peppes.PeppesInteraction;
import world.ucode.scenes.GameOver;
import world.ucode.scenes.MainMenu;
import javafx.scene.image.ImageView;


import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;

public class gamePlayController extends Controller {
    Peppes peppes;
    PeppeAnimation animation;
    Timeline LifeCycle;
    @FXML
    private ImageView PeppeView;;
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
        healthBar.setProgress(peppes.getHealth() / peppes.getMaxHealth());
        happiestBar.setProgress(peppes.getHappy() / 10);
        hungerBar.setProgress(peppes.getHunger() / 10);
        thirstBar.setProgress(peppes.getThirst() /10);
        cleanlinessBar.setProgress(peppes.getCleanliness() / 10);
    }

    @FXML
    void backMainMenu(ActionEvent event) {
        MainMenu menu = new MainMenu(primaryStage);
    }

    @FXML
    void hadlePlay() throws InvocationTargetException, IllegalAccessException {
        peppes.ActionHandler(PeppesInteraction.PLAY, peppes);
        animation.HadleAnimation(PeppesInteraction.PLAY);
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

    private void startLifeCycle() {
        LifeCycle = new Timeline();
        LifeCycle.setCycleCount(Timeline.INDEFINITE);

        LifeCycle.getKeyFrames().add(
                new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if(peppes.LifeCycle() == -1) {
                            LifeCycle.stop();
                            GameOver menu = new GameOver(primaryStage);
                        }
                    setProgress();
                }
        }));
        LifeCycle.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        startLifeCycle();
    }

}

