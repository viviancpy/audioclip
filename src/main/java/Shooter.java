import javafx.application.Platform;
import javafx.scene.media.AudioClip;

import java.net.URL;

public class Shooter{

    public Shooter(){}

    public void shoot() {
        URL resource = getClass().getResource("/beep.wav");
        if (resource != null) {
            final AudioClip sound = new AudioClip(resource.toExternalForm());
            if (!sound.isPlaying()) {
                Platform.runLater(() -> sound.play(4.0));

            }
        }
    }
}