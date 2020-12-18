package world.ucode.peppes;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class PeppeAnimation {
    PeppeType type;
    private final ImageView AnimationView;
    private final Timeline timeline;

    public PeppeAnimation(PeppeType type, ImageView AnimationView, ImageView PeppesView, ImageView animationView) {

        this.AnimationView = animationView;
        this.type = type;
        this.timeline = new Timeline(new KeyFrame(Duration.seconds(4), actionEvent -> AnimationView.setVisible(false)));
        AnimationView.setVisible(true);
        PeppesView.setImage(new Image("/GamePlay/" + type.toString() + "/" + "happy.gif"));
    }

    public void HadleAnimation(PeppesInteraction action) {
        AnimationView.setImage(GetImage(action));
        AnimationView.setVisible(true);
        timeline.play();
    }
    private Image GetImage(PeppesInteraction action) {
        return new Image("/GamePlay/" + type.toString() + "/" + action.toString() + ".gif", 800, 600, false, false);
    }
}
