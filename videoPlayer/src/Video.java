import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
public class Video extends Application{
    @Override
    public void start(Stage primaryStage) {
        String path = "D:/Program Files\\JiJiDown\\Download/a.mp4";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.setAutoPlay(true);
        mediaView.setFitHeight(900);
        mediaView.setFitWidth(1600);
        Group root = new Group();
        root.getChildren().add(mediaView);
        Scene scene = new Scene(root, 1600, 900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("嘉va");
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}