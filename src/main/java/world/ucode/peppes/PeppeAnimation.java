package world.ucode.peppes;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class PeppeAnimation {
    PeppeType peppeType;
    private final ImageView AnimationView;
    private final Timeline timeline;

    public PeppeAnimation(PeppeType peppeType, ImageView animationView, ImageView peppeViev) {
        this.AnimationView = animationView;
        this.peppeType = peppeType;
        this.timeline = new Timeline(new KeyFrame(Duration.seconds(4), actionEvent -> AnimationView.setVisible(false)));
        AnimationView.setVisible(true);
        peppeViev.setImage(new Image("/images/" + peppeType.toString() + "/" + "defaultStatus.gif"));
    }

    public void HadleAnimation(PeppesInteraction action) {
        AnimationView.setImage(GetImage(action));
        AnimationView.setVisible(true);
        timeline.play();
    }
    private Image GetImage(PeppesInteraction action) {
        return new Image("/images/" + peppeType.toString() + "/" + action.toString() + ".gif");
    }
}
